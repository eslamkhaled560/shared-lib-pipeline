#!/usr/bin/env groovy

def cleanUp() {
    echo "Deleting local docker image..."
    sh "docker rmi islamdevops/pvt-repo:${BRANCH_NAME}"
    echo "Deleting is successful"
}