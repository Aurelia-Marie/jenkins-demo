pipeline {
    agent any
    stages {
        stage('Deploy - Staging') {
            steps {
                bat 'echo Deploying to staging'
                bat 'echo Running smoke tests'
            }
        }
        stage('Sanity check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Deploy - Production') {
            steps {
                bat 'echo Deploying to production'
            }
        }
    }
}
