#!/bin/bash 

(set -a; source .env && ./gradlew $*)
