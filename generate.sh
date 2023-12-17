#!/bin/bash 

function check-env() {
    echo "check-env"
    if [ -z "$DIVI_CLIENT_DIR" ]; then
        echo " ** DIVI_CLIENT_DIR env var must not be null"
        exit 1
    fi
    echo "DIVI_CLIENT_DIR: '${DIVI_CLIENT_DIR}'"

    if [ -z "$DIVI_CLIENT_VERSION" ]; then
        echo " ** DIVI_CLIENT_VERSION env var must not be null"
        exit 1
    fi
    echo "DIVI_CLIENT_VERSION: '${DIVI_CLIENT_VERSION}'"
}

function update-client-doc-generated() {
    GENERATED_DOC_DIR=./client-doc-generated
    #rm -rf ${GENERATED_DOC_DIR}
    mkdir -p ${GENERATED_DOC_DIR}
    cp -a ${DIVI_CLIENT_DIR}/README.md ${DIVI_CLIENT_DIR}/docs ${GENERATED_DOC_DIR}
}

function generate-client() {
    # prep target dirpath
    mkdir -p ${DIVI_CLIENT_DIR}

    # see: https://github.com/OpenAPITools/openapi-generator/issues/12550#issuecomment-1152596082
    #   disallowAdditionalPropertiesIfNotPresent=false
    ADDITIONAL_PROPERTIES=disallowAdditionalPropertiesIfNotPresent=false

    # build cmdline
    read -r -d '' CMD << EOM
openapi-generator-cli generate \
   -i https://uat.intensivregister.de/api/public/api-docs \
   --api-package ${DIVI_CLIENT_GROUP}.divi.client.api \
   --model-package ${DIVI_CLIENT_GROUP}.divi.client.model \
   --invoker-package ${DIVI_CLIENT_GROUP}.divi.client.invoker \
   --group-id ${DIVI_CLIENT_GROUP} \
   --artifact-id divi-openapi-client \
   --artifact-version ${DIVI_CLIENT_VERSION} \
   --additional-properties=${ADDITIONAL_PROPERTIES} \
   -g java \
   -p java8=true \
   --library okhttp-gson \
   -o "${DIVI_CLIENT_DIR}"
EOM
    echo "generating client:
${CMD}"
    
    # run the generator
    $CMD
}

(set -a; source .env && check-env && generate-client && update-client-doc-generated)
