def call (string makeParams, string projectname, string buildir)
{
dir(buildir)
{

def 1st = ["WESUTILS"];

println(1st.contains (projectname));
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
