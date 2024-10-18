def call(string projectName,string Imagetag,string DockerHubUser){
sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
