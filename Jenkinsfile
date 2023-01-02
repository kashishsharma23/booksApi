pipeline{
  agent any
  tools{
    maven 'maven_3_5_0'
  }
  stages{
    stage('Build maven'){
      steps{
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kashishsharma23/booksApi.git']]])
        sh 'mvn clean install'
      }
    }
    stage('Build docker image'){
      steps{
        script{
          sh 'docker build -t booksapi .'
        }
      }
    }
    stage('Push image to hub'){
      steps{
        script{
          withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
            sh 'docker login -u kashish238 -p ${dockerhubpwd}'
          }
          sh 'docker push booksapi'
        }
      }
    }
  }
}