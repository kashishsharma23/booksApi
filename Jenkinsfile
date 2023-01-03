pipeline {
	agent none
  stages {
  	stage('Maven Install') {
    	agent {
      	any{
        	image 'maven:3.5.0'
        }
      }
      steps {
      	bat 'mvn clean install'
      }
    }
    stage('Docker Build') {
    	agent any
      steps {
	bat 'wsl'
      	sh 'docker build -t kashish238/spring:latest .'
      }
    }
  }
}
