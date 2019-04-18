pipeline {
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
    stage("Build Docker image"){
      steps{
        sh 'docker build -t lfarul/TempMethod2:5.0.0 .'
        echo "Building Docker image..."
      }
    }
  }
}

         
