pipeline {
    agent any

    tools {
        maven 'Maven 3.8.7' // Use the Maven name you defined in Jenkins' global tools
    }

    environment {
        JAVA_HOME = "/opt/java/openjdk"
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/hyuga127/DemoSimpleCICD.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo '✅ Build and test succeeded!'
        }
        failure {
            echo '❌ Build or test failed.'
        }
    }
}
