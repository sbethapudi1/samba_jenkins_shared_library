def call (String makeParams, String projectname, String buildir)
{
dir(buildir)
{

def st1 = ["WESUTILS"]

println(st1.contains (projectname))
version(projectname)

if(  projectname == "WESUTILS")
{
	bat '''

    msbuild  /t:clean /property:Configuration=Release 
	
	'''


	bat '''

	msbuild  /t:build /property:Configuration=Release  ${makeParams}
	'''
  }
}

}
