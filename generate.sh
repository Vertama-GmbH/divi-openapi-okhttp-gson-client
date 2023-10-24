#!/bin/bash 

# Prerequisites
# if [[ "$#" -lt 1 ]]; then
#     echo "usage: $0 <target dir> [<version>]"
#     exit 1
# fi

# like: divi-openapi-client-okhttp-gson
CLIENT_DIR=${1:-build/openapi-generator-cli-generated}
VERSION=${2:-$(date "+%Y.%m.%d")}

# make sure the whole path to that dir exists
mkdir -p ${CLIENT_DIR}

openapi-generator-cli generate \
   -i https://uat.intensivregister.de/api/public/api-docs \
   --api-package de.vertama.divi.client.api \
   --model-package de.vertama.divi.client.model \
   --invoker-package de.vertama.divi.client.invoker \
   --group-id de.vertama \
   --artifact-id divi-openapi-client \
   --artifact-version ${VERSION} \
   -g java \
   -p java8=true \
   --library okhttp-gson \
   -o "${CLIENT_DIR}"
