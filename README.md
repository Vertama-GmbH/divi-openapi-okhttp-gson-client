# A Java DIVI generated client with okhttp and gson from its official OpenAPI spec

This package is just wrapping a maven-central / sonatype nexus publishing around the OpenAPI java client the the https://www.intensivregister.de/.

So all actual source for the DIVI interaction does not come from here, and we do not claim any rights on that. On all that is in here, which comes from the Vertama GmbH you can use it in any way you like. The real client source/specification comes from: https://uat.intensivregister.de/api/public/api-docs

_Notice: This is pretty ugly, quick and dirty scripting, and for sure not optimal, nor minimal, nor an any way a recommendation on how to do things. After many, many, many attemps to embed the nexus/maven publising in a build script, with maven, or kotlin, or an init script, or a a build script, or patching the openapi build script templates, or or or, I ended up with this. It works for me, and may help you, but in no way claims any authority on how you should craft your java build processes with gradle or otherwise._


## What does it Do?

It pull the openapi spec form the divi site, generates a java client lib from it, and pubishes it the maven central repository. 

## What you have to do

Check some of the background info to understand how to create a Sonatype account and on how to provide the needed GPG public/private key infra. You need that for crytographic signing your publications, which is must for nexus publising. 

You also need to install the actuall openapi generator. There are LOTS! of possibilites you could do this. I decided to go the npm way: `npm install @openapitools/openapi-generator-cli -g`. You could use a maven plugin, or whatever, but then you have to adjust the `generate.sh` script on your own. Should be possible, but I do not care. 

## When you're ready, do this

 1. copy the `.env.example` file to `.env`, open it and fill in your content (give me a hint when its seems unclear what you have to fill in).

This package is 12 Factor (google it). It avoids any gradle init scripts, gradle properties, in this dir or your home dir, nor does it use any other of the 27 possibilites to configur your java process. It does use the config you provide to the process in its environment via the .env file. One file, end of story.

 2. run `./generate.sh` to generate the actual java client
 read the script. Its basically pretty simple. It pulls and checks the .env configuration and runs the openapi generator. When things work out, you find the generated client source code in the DIVE_CLIENT_DIR.

 3. run `./env-gradle <task>` to run the publishing process.
 Again, this is a very minimal wrapper around running the actual gradle, including pull and check of the .env config. What might be of notice here is the architecture decision I took: The gradle build I am useing here, is completely ignoring whatever build script the generated created. It used the hand crafted `build.gradle.kts` file in this directory. Any attempt of mine (2 weeks, yes I am to stupid for this java/gradle stack) to reuse that script, or build on it, or automatically replace it, or enhance it to contain what I need for publising, or to configuer it, or or or, all this failed. So I gave up. Now, I have a build script that works, it defines the source sets to use the generated source, and the dependencies I hand copied from the generated build into my newly created script. Plus porting a fee settings and options. Ugly? For sure. Feel free to come up with a better idea, with still using the exact source of the generated client, and without any manual step needed to publish. 

A simple test to check your gradle build is: `./env-gradle tasks`, which should list all the things you can ask for. 

My actuall publishing command is: 
```
$ ./env-gradle.sh publishToSonatyp  closeAndReleaseStagingRepository
```

And off ya go. 

# Results

This is where it all ends up: `https://central.sonatype.com/artifact/de.vertama/divi-openapi-client/versions`. As you might easly spot, the version number is just the date I did it. Logic behind it is, the version is basically a null info in this case, it is all about the actuall openapi client from the dive. So I decided to put the date in the version, so I can see when I pulled it off. 

```XML
# maven pom
<dependency>
    <groupId>de.vertama</groupId>
    <artifactId>divi-openapi-client</artifactId>
    <version>2023.10.24.1</version>
</dependency>

# gradle (kotlin)
implementation("de.vertama:divi-openapi-client:2023.10.24.1")

# gradle
implementation 'de.vertama:divi-openapi-client:2023.10.24.1'
```

have fun.
