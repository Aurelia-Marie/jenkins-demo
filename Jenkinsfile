pipeline {
    agent any
    stages {
        stage('Deploy') {
            steps {
                timeout(time: 3, unit: 'MINUTES') {
                    retry(5) {
                        bat 'ping -n 30 127.0.0.1 > nul'
                    }
                }
            }
        }
    }
}
