pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                bat 'docker run --rm -v "%WORKSPACE%":/project -w /project gradle:jdk21 gradle check'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/**/*.xml'
        }
    }
}
