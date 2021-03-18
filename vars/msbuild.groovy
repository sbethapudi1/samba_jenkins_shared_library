def call (string makeParams, string projectname, string buildir)
{
dir(buildir)
{
def 1st = ["CA_Enaber", "Lassan WDA"];
println(1st.contains (projectname));
version (projectname)
}
if( projectname. take (3) == "DHC" || project name == "Lassan_WDA")
{
	bat '''

    msbuild  /t:clean /property:Configuration=Release 
	
	'''
}

	bat '''

	msbuild  /t:build /property:Configuration=Release  ${makeParams}
	'''
}
}
