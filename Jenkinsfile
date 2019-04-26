pipeline {
  agent any
  stages {
    // Kompiluje plik
    stage("Compile") {
      steps {
        echo "Compiling the file..."
        sh 'javac TempMethod2.java'       
  }
}
    // Przeprowadzam testy jednostkowe
    stage("JUnit Test") {
      steps {
        echo "Testing the file..."
        sh 'javac TempMethod2Test.java'
      }
    }
    // Buduje obraz Dockera dla Docker Registery 
    stage("Build Docker image for DockerHub"){
      steps{
        echo "Building Docker image for Docker Registery..."
        // lfarul to mój username na dockerhub i musi być w nazwie image / nazwa obrazu : wersja obrazu
        sh 'docker build -t lfarul/tm2:3.0 .'
      }
    }
      // Buduje obraz Dockera dla Google Cloud
    stage("Build Docker image for Google Cloud"){
      steps{
        echo "Building Docker image for Docker Repository..."
        sh 'docker build -t gcr.io/nowyprojekt-235718/tm2:3.0 .'
      }
    }  
    // Robie push obrazu Dockera na chmure Dockera
    stage("Push Docker image to Docker Registery"){
      steps{
        echo "Pushing Docker image to Docker Registery..."
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubpwd')]) {
          sh "docker login -u lfarul -p ${dockerHubpwd}"
        }
        sh 'docker push lfarul/tm2:3.0'
      }
    }
    // Robie push obrazu Dockera na chmure Google
    //stage("Push Docker image to Google Cloud"){
      //steps{
        //echo "Pushing Docker image to Google Cloud..."
        //withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubpwd')]) {
          //sh "docker login -u lfarul -p ${dockerHubpwd}"
        //}
        //sh 'docker push gcr.io/nowyprojekt-235718/tm2:3.0'
      //}
    //}
  }
}

