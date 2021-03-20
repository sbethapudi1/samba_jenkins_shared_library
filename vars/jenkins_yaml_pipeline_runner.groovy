def call(final Strig yamlFile)
{

  Map pipelineConfig = readYaml(file: "${WORKSPACE}/${yamlFile}")
  echo " parsed yaml : "+pipelineConfig
  

}