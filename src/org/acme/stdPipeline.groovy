#!/bin/groovy
package org.acme;
import org.yaml.snakeyaml.Yaml

def execute() {

  node {

    stage('Initialize') {
      checkout scm
      echo 'Loading pipeline definition'
      Yaml parser = new Yaml()
      Map pipelineDefinition = parser.load(new File(pwd() + '/pipeline.yaml').text)
    }

    switch(pipelineDefinition.pipelineType) {
      case 'python':
        // Instantiate and execute a Python pipeline
        new pythonPipeline(pipelineDefinition).executePipeline()
      case 'nodejs':
        // Instantiate and execute a NodeJS pipeline
        new NodeJSPipeline(pipelineDefinition).executePipeline()
      case 'msbuild':
        // Instantiate and execute a Msbuild pipeline
        new MsbuilPipeline(pipelineDefinition).executePipeline()
    }

  }

}