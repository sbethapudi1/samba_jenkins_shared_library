def call(final String yamlFile)
{

  Map pipelineConfig = readYaml(file: "${WORKSPACE}/${yamlFile}")
  echo " parsed yaml : "+pipelineConfig
  

}