
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code retrieved from GitHub'
            }
        }

        stage('Build') {
            steps {
                echo 'Building application'
                bat 'echo Build completed'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests'
                bat 'echo All tests passed'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application'
                bat 'echo Deployment successful'
            }
        }
    }

    post {
        success {
            echo 'JENKINSFILE PIPELINE SUCCESS'
        }
        failure {
            echo 'PIPELINE FAILED'
        }
    }
}
