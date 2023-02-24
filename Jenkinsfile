#!/usr/bin/env groovy

def gv

pipeline {
    agent any
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
<<<<<<< HEAD
                    gv.buildI()
=======
                    gv.build()
>>>>>>> 8fe421475d1ec78fdbfafc60b50da8876533f33b
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

