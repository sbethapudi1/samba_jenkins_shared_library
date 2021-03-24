def call() {
    node('java') {

        stage('Checkout') {
            checkout scm
        }

         def p = pipelineConfig()

        stage('Prerequistes'){
            serviceName = sh (
                    script: "echo ${p.SERVICE_NAME}|cut -d '-' -f 1",
                    returnStdout: true
                ).trim()
        }

        stage('Build & Test') {
                sh "mvn --version"
                sh "mvn -Ddb_port=${p.DB_PORT} -Dredis_port=${p.REDIS_PORT} clean install"
        }

        stage ('Push Docker Image') {
            docker.withRegistry('https://registry-opstree.com', 'dockerhub') {
                sh "docker build -t opstree/${p.SERVICE_NAME}:${BUILD_NUMBER} ."
                sh "docker push opstree/${p.SERVICE_NAME}:${BUILD_NUMBER}"
            }
        }

        stage ('Deploy') {
            echo "We are going to deploy ${p.SERVICE_NAME}"
            
			}

    }
}