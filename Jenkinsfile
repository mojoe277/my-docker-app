#!/usr/bin/env groovy

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
        stage("test") {
            steps {
                script {
                    gv.test()
                }
            }
        }
        stage("build") {
            when {
                expression {
                   BRANCH_NAME == 'master' 
                }
            }
            steps {
                script {
                    gv.buildImage()
                }
            }
        }
        stage("deploy") {
             when {
                expression {
                   BRANCH_NAME == 'master' 
                }
            }
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}

