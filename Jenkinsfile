pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'docker run --rm -v "%WORKSPACE%":/project -w /project gradle:jdk21 gradle build'
            }
        }
        stage('Test') {
            steps {
                bat 'docker run --rm -v "%WORKSPACE%":/project -w /project gradle:jdk21 gradle check'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            junit 'build/test-results/**/*.xml'
        }
    }
}
