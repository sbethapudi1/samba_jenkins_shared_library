def call (String makeParams, String projectname, String buildir)
{
node {
	dir(buildir)
	{

	def st1 = ["WESUTILS"]

	println(st1.contains (projectname))
	version(projectname)

	if(  projectname == "WESUTILS")
	{
	
	    echo "makeParams : ${makeParams}"
		
		bat """
        echo %makeParams%
		msbuild  /t:clean /property:Configuration=Release  ${makeParams}
		
		"""


		bat """
		
		msbuild  /t:build /property:Configuration=Release  %makeParams%
		
		"""
	  }
	}
  }
}
