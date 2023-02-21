#!/usr/bin/env groovy

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '') 
    }
    stages {
        stage('build') {
            steps {
                    echo "Building the application..."
                    echo "building version ${NEW_VERSION}"
            }
        }
        stage('test') {
            steps {
                    echo "Testing the application..."
                }
            }
        stage('deploy') {
            steps {
                    echo "Deploying the application..." 
                    echo "deploying version ${params.VERSION}"
                }
        }
    }
}
