pipeline {
  agent any
  stages {
    stage("Compile") {
      steps {
        echo "Compiling..."
        sh "./gradlew compileJava"
      }
    }
  stage ("Unit Test") {
    steps {
      echo "Unit testing..."
      sh "./gradlew test"
    }
  }
  }
}
