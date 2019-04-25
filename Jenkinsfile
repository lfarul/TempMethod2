pipeline {
  agent any
  stages {
    // Kompiluje plik
    stage("Compile") {
      steps {
        echo "Compiling the file"
        sh 'javac TempMethod2.java'
        
  }
}
    stage("Test") {
      steps {
        echo "Testing..."
      }
    }
    // Buduje obraz Dockera
    stage("Build Docker image"){
      steps{
        echo "Building Docker image..."
        // lfarul to mój username na dockerhub i musi być w nazwie image / nazwa obrazu : wersja obrazu
        sh 'docker build -t lfarul/tm2:2.0 .'
        sh 'docker build -t gcr.io/nowyprojekt-235718/tm2:2.0 .'
      }
    }
    // Robie push obrazu Dockera na chmure Dockera
    stage("Push Docker image"){
      steps{
        echo "Pushing Docker image..."
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubpwd')]) {
          sh "docker login -u lfarul -p ${dockerHubpwd}"
        }
        sh 'docker push lfarul/tm2:2.0'
      }
    }
  }
}

