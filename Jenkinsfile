pipeline {
  environment {
    registry = 'lfarul/docker-test'
    registryCredenrial = 'dockerhub'
    dockerImage = ''
  }
  agent any
  stages {
    stage("Compile") {
      steps {
        sh 'javac TempMethod2.java'
        echo "Compiling..."
  }
}
    stage("Test") {
      steps {
        echo "Testing..."
      }
    }
    stage("Build"){
      steps{
        sh 'java TempMethod2'
        echo "Building..."
      }
    }
    stage ("Deploy image"){
      steps{
        script{
          docker.withRegistry ('', registryCredential){
            dockerImage.push
          }
        }
      }
    }
  }
}
         
