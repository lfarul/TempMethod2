pipeline {
  agent any
  stages {
    stage("Compile") {
      steps {
         steps {
          sh 'javac TempMethod2'
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
