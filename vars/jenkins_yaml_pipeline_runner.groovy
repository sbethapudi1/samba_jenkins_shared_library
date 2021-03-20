def call(final String yamlFile)
{

  Map pipelineConfig = readYaml(file: "${env.WORKSPACE}/${yamlFile}")
  echo " parsed yaml : "+pipelineConfig
  

}