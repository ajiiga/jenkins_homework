pipeline {
  agent any
  stages {
    stage('Disc') {
      steps {
        sh(script: 'echo Disc information')
        sh(script: 'df -h')
      }
    }
  }
}