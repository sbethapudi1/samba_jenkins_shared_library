def call(String buildtool, String makeParams, String projectname, String buildir)
//script{ datas = readyaml (file: 'jenkins.yaml') )
if ( buildtool == "make" ) {
//previously ($datas.compile.makeParams), ${datas.projectname}, $datas.compile buildir)), projectname doesnt exist in yaml
make makeParams, projectname, buildir)
} 
else if ( buildtool == "msbuild" ) {
msbuild( makeParams, projectname, buildir)
} 
else if ( buildtool == "cmake" ) {
cmake()
}
else if ( buildtool -- "maven" ) {
maven
else if (buildtool == "devenv") {
deven()
}
}
