//import org.jetbrains.dokka.Platform
//import java.net.URL

group = System.getenv("DIVI_CLIENT_GROUP")
version = System.getenv("DIVI_CLIENT_VERSION")

object Meta {
    val desc = "A featureless java lib only to test publishing java libs to maven central"
    val githubRepo = "Vertama-GmbH/zero-feature-maven-central-publish-test"
    val release = "https://s01.oss.sonatype.org/service/local/"
    val snapshot = "https://s01.oss.sonatype.org/content/repositories/snapshots/"
    val license = "Apache-2.0"
    val license_url = "https://opensource.org/licenses/Apache-2.0"

    object Author {
        val id = "dluesebrink"
        val name = "Dirk Lüsebrink"
        val email = "dev@vertama.com"
        val organization = "Vertama GmbH"
        val organization_url = "https://vertama.com/"
    }

    val client_dir = System.getenv("DIVI_CLIENT_DIR")

    // lifted from generated build script in client_dir
    val jakarta_annotation_version = "1.3.5"
}



plugins {
    `java-library`
    `maven-publish`

    signing
    id("io.github.gradle-nexus.publish-plugin") version "1.3.0"
}

sourceSets {
    main {
        java {
            println("source dir: \"${Meta.client_dir}/src/main/java\"")
            srcDir("${Meta.client_dir}/src/main/java")
        }
    }
    test {
        java {
            println("test source dir: \"${Meta.client_dir}/src/test/java\"")
            srcDir("${Meta.client_dir}/src/test/java")

        }
    }
}

repositories {
    mavenCentral()
    //mavenLocal()
}

// this actually copied from the openapi generated build script in the source dir
dependencies {
    implementation("io.swagger:swagger-annotations:1.6.8")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
    implementation("com.google.code.gson:gson:2.9.1")
    implementation("io.gsonfire:gson-fire:1.8.5")
    implementation("javax.ws.rs:jsr311-api:1.1.1")
    implementation("javax.ws.rs:javax.ws.rs-api:2.1.1")
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")
    //implementation group: 'org.apache.commons', name: 'commons-lang3', version: '3.12.0'
    implementation("jakarta.annotation:jakarta.annotation-api:${Meta.jakarta_annotation_version}")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testImplementation("org.mockito:mockito-core:3.12.4")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.1")

    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api("org.apache.commons:commons-math3:3.6.1")

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation("com.google.guava:guava:32.1.1-jre")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    withJavadocJar()
    withSourcesJar()
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        //(options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }

    // ported from generated build.gradle:
    //      options.tags = [ "http.response.details:a:Http Response Details" ]
    //
    // fixing:
    //    ./openapi-generator-cli-generated/src/main/java/de/vertama/divi/client/api/MeldebereichPublicControllerApi.java:199: 
    //    error: unknown tag: http.response.details
    //      * @http.response.details
    //
    (options as StandardJavadocDocletOptions).tags("http.response.details:a:Http Response Details")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {

            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            from(components["java"])

            versionMapping {
                usage("java-api") {
                    fromResolutionOf("runtimeClasspath")
                }
                usage("java-runtime") {
                    fromResolutionResult()
                }
            }
            pom {
                name.set(project.name)
                description.set(Meta.desc)
                url.set("https://github.com/${Meta.githubRepo}")
                licenses {
                    license {
                        name.set(Meta.license)
                        url.set(Meta.license_url)
                    }
                }
                developers {
                    developer {
                        id.set(Meta.Author.id)
                        name.set(Meta.Author.name)
                        email.set(Meta.Author.email)
                        organization.set(Meta.Author.organization)
                        organizationUrl.set(Meta.Author.organization_url)
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/${Meta.githubRepo}.git")
                    developerConnection.set("scm:git:git://github.com/#${Meta.githubRepo}.git")
                    url.set("https://github.com/${Meta.githubRepo}")
                }
            }
        }
    }
}

signing {
    //sign(publishing.publications["mavenJava"])

    val key = providers.environmentVariable("GPG_SIGNING_KEY")
    val phrase = providers.environmentVariable("GPG_SIGNING_PASSPHRASE")
    if (!key.isPresent || !phrase.isPresent) {
        throw GradleException(" ** GPG_SIGNING_KEY a/o GPG_SIGNING_PASSPHRASE env vars missing")
    }
    useInMemoryPgpKeys(key.get(), phrase.get())

    val extension = extensions.getByName("publishing") as PublishingExtension
    sign(extension.publications)
    //sign(publishing.publications["mavenJava"])
}

nexusPublishing {
    repositories {
        //create("myNexus") {
        sonatype {
            nexusUrl.set(uri(Meta.release))
            snapshotRepositoryUrl.set(uri(Meta.snapshot))
            val ossrhUsername = providers.environmentVariable("OSSRH_USERNAME")
            val ossrhPassword = providers.environmentVariable("OSSRH_PASSWORD")
            if (!ossrhUsername.isPresent || !ossrhPassword.isPresent) {
                throw GradleException(" ** username, password must be defined in ENV as: 'OSSRH_USERNAME' and 'OSSRH_PASSWORD'")
            }

            username.set(ossrhUsername.get())
            password.set(ossrhPassword.get())
        }
    }
}
