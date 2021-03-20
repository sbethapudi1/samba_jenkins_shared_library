#!/usr/bin/groovy
import java.util.ArrayList
import java.util.LUID

def readPipelineYaml() {
def jenkinsSettingsMap = [:] scmCheckout 'BitBucketSCM'
println("reading jenkins.yam")
if(fileExists('jenkins.yaml')) {

jenkins SettingsMap = readyaml file: 'jenkins.yaml'
 }

return jenkins SettingsMap
}
def runstages() {

gitclone(gitrepo, 570d9886-9dc7-4d24-a611-5dc7227f2842, pitbranch, submodule)
}