#!/usr/bin/groovy
package org.acme;

def call() {
  node {
    stage('Checkout') {
      checkout scm
    }
    def p = pipelineCfg()

    if (p.runTests == true) {
      
        stage('Test') {
          sh 'pip install -r requirements.txt'
          sh p.testCommand
        }
      
    }

    if (env.BRANCH_NAME == 'master' && p.deployUponTestSuccess == true) {
      
        stage('Deploy') {
          sh "echo ${p.deployCommand} ${p.deployEnvironment}"
        }
      
    }
	
	}
	
	}