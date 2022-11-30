pipeline {
    agent any
        stages{
            stage('code build'){
                steps{
                      git credentialsId: 'mohit', url: 'git@github.com:mohit-decoder/student-ui.git'                  
                }
            }
            stage('maven'){
                steps {
                    sh 'mvn clean package'
                }
            }
        }
    }
