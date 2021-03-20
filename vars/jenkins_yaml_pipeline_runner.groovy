import org.apache.commons.lang.SystemUtils

def call(final String yamlFile) {

	node{

		Map pipelineConfig = null
		if (SystemUtils.IS_OS_WINDOWS){
			pipelineConfig =readYaml(file: "${env.WORKSPACE}\\${yamlFile}")
		}
		else if (SystemUtils.IS_OS_MAC){
			pipelineConfig =readYaml(file: "${env.WORKSPACE}/${yamlFile}")
		}
		else if (SystemUtils.IS_OS_LINUX){
			pipelineConfig =readYaml(file: "${env.WORKSPACE}/${yamlFile}")
		}
		else {
			pipelineConfig =readYaml(file: "${env.WORKSPACE}/${yamlFile}")
		}


		echo " parsed yaml : "+pipelineConfig
	}  // end of node
	
}  // end of def 
