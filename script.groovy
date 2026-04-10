def buildJar() {
    echo 'building the application...'
    sh 'mvn package'
}

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'DOCKERHUB_CREDENTIALS', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t hanoosh/java-maven:jma-1.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push hanoosh/java-maven:jma-1.0'
    }
}

def deployApp() {
    echo 'deploying the application...'
}

return this
