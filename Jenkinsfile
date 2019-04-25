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
        sh 'docker build -t lfarul/tm2:1.0 .'
      }
    }
    stage("Push Docker image"){
      steps{
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubpwd')]) {
          sh "docker login -u lfarul -p ${dockerHubpwd}"
        }
        sh 'docker push lfarul/tm2:1.0'
        echo "Pushing Docker image..."
      }
    }
  }
}

