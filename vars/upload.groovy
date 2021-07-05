def call(nexusRepo){
def pom = readMavenPom file: 'pom.xml'
 def repo = nexusRepo
 def groupId = pom.groupId
 def artifactId = pom.artifactId
 nexusArtifactUploader artifacts: [[artifactId: artifactId, classifier: '', file: "target/myweb-${pom.version}.war", type: 'war']], 
 credentialsId: 'nexus3', 
 groupId: groupId, 
 nexusUrl: '172.31.31.98:8081', 
 nexusVersion: 'nexus3', 
 protocol: 'http', 
 repository: repo, 
 version: pom.version
}

