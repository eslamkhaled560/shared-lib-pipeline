#!/usr/bin/env groovy

def call() {
    echo "Building docker image..."
    sh "docker build -t islamdevops/pvt-repo:${BRANCH_NAME} ."
    echo "Building is successful"
}
