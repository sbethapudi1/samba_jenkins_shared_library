def call (string makeParams, string projectname, string buildir)
{
dir(buildir)
{

def st1 = ["WESUTILS"]

println(st1.contains (projectname))
version(projectname)

if(  project name == "WESUTILS")
{
	bat '''

    msbuild  /t:clean /property:Configuration=Release 
	
	'''


	bat '''

	msbuild  /t:build /property:Configuration=Release  ${makeParams}
	'''
  }
}
