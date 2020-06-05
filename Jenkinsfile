pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /Users/workspace/Maven/repository:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}
