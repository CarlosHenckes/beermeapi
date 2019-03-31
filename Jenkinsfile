pipeline {
  agent any
  stages {
    stage('clone') {
      steps {
        git(url: 'https://github.com/CarlosHenckes/test_compasso.git', branch: 'master')
      }
    }
  }
}