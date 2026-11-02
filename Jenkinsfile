pipeline {
    agent any
    stages {
        stage('No-op') {
            steps {
                bat 'exit /b 1'
            }
        }
    }
    post {
        always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
        failure {
            echo 'I failed :('
            mail to: 'aureliaforson31@gmail.com',
                 subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                 body: "Something is wrong with ${env.BUILD_URL}"
        }
    }
}
