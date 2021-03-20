def call(final String yamlFile)
{

 node{

  Map pipelineConfig = readYaml(file: "${env.WORKSPACE}/${yamlFile}")
  echo " parsed yaml : "+pipelineConfig
  
  }
  
}