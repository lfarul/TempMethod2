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
    stage("Build"){
      steps{
        echo "Building..."
      }
    }
  }
}
