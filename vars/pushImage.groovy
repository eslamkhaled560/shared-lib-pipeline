#!/usr/bin/env groovy

def call() {
    echo "Pushing docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'USER', passwordVariable: 'PWD')]) {
        sh "echo $PWD | docker login -u $USER --password-stdin" 
    }
    sh "docker push islamdevops/pvt-repo:${BRANCH_NAME}"
    echo "Pushing is successful"
}
