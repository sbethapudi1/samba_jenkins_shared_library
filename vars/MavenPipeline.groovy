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
                bat "mvn -Ddb_port=${p.DB_PORT} -Dredis_port=${p.REDIS_PORT} clean install"
        }

        stage ('Push Docker Image') {
            echo "Push Docker Image"
        }

        stage ('Deploy') {
            echo "We are going to deploy ${p.SERVICE_NAME}"
            
			}

    }
}