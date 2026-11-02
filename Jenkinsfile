pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Deploy - Staging') {
            steps {
                bat 'echo Deploying to staging'
                bat 'echo Running smoke tests'
            }
        }
        stage('Deploy - Production') {
            steps {
                bat 'echo Deploying to production'
            }
        }
    }
}
