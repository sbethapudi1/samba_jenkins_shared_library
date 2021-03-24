def call() {
    node('master') {

        stage('Checkout') {
            checkout scm
        }

         def p = pipelineConfig()

        stage('Prerequistes'){
            echo "Prerequistes ${p.SERVICE_NAME}"
        }

        stage('Build & Test') {
                bat "mvn --version"
                
        }

        stage ('Push Docker Image') {
            echo "Push Docker Image"
        }

        stage ('Deploy') {
            echo "We are going to deploy ${p.SERVICE_NAME}"
            
			}

    }
}