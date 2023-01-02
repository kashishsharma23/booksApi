pipeline{
  agent any
  tools{
    maven 'maven_3_5_0'
  }
  stages{
    stage('Build maven'){
      steps{
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kashishsharma23/booksApi.git']]])
        bat 'mvn clean install'
      }
    }
    stage('Build docker image'){
      steps{
        script{
          checkout scm
          sh 'docker build -t books .'
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
