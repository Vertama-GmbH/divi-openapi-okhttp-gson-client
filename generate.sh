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

function generate-client() {
    read -r -d '' CMD << EOM
openapi-generator-cli generate \
   -i https://uat.intensivregister.de/api/public/api-docs \
   --api-package ${DIVI_CLIENT_GROUP}.divi.client.api \
   --model-package ${DIVI_CLIENT_GROUP}.divi.client.model \
   --invoker-package ${DIVI_CLIENT_GROUP}.divi.client.invoker \
   --group-id ${DIVI_CLIENT_GROUP} \
   --artifact-id divi-openapi-client \
   --artifact-version ${DIVI_CLIENT_VERSION} \
   -g java \
   -p java8=true \
   --library okhttp-gson \
   -o "${DIVI_CLIENT_DIR}"
EOM
    echo "generating client:
${CMD}"
    
    # prep target dirpath
    mkdir -p ${DIVI_CLIENT_DIR}
    # finally run the generator
    $CMD
}

(set -a; source .env && check-env && generate-client)
