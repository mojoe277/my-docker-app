#!/usr/bin/env groovy

library identifier: 'jenkins-shared-library@master', retriever: modernSCM(
        [$class: 'GitSCMSource',
         remote: 'https://gitlab.com/nanuchi/jenkins-shared-library.git',
         credentialsId: 'github-credentials'
        ]
)



def gv

pipeline {
    agent any
    tools {
        nodejs 'my-nodejs'
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build") {
            steps {
                script {
                    build()
                }
            }
        }
        stage("build and push image") {
            steps {
                script {
                    buildImage 'mojoe277/nodejs-app:njs-3.0'
                    dockerLogin()
                    dockerPush 'mojoe277/nodejs-app:njs-3.0'
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}

