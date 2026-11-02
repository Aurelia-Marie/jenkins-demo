pipeline {
    agent any
    stages {
        stage('Deploy') {
            steps {
                retry(3) {
                    bat 'exit /b 1'
                }
            }
        }
    }
}
