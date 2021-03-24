#!/usr/bin/groovy
package org.acme;

Map pd = null

MsbuildPipeline(Map pipelineDefinition) {
  // Create a globally accessible variable that makes
  // the YAML pipeline definition available to all scripts
  pd = pipelineDefinition
}

def executePipeline() {
  
}

return this