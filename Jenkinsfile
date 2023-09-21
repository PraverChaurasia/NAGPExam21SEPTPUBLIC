pipeline{
  agent any
  environment{
    PATH = "$PATH:c:/apache-maven-3.6.8/bin"
  }
  stages{
    stage("Get Code"){
      steps{
        git branch: 'master', changelog: false, poll: false, url: 'https://github.com/PraverChaurasia/NAGPExam21SEPTPUBLIC.git/'
      }
    }
    stage("Build Code"){
          steps{
            bat 'mvn clean test'
          }
    }
    stage("Sonar Qube"){
      steps{
        withSonarQubeEnv('sonar_qube'){
          bat 'mvn clean verify sonar:sonar  -Dsonar.projectKey=NAGP_EXAM_pipeline_jenkinsfile -Dsonar.projectName="NAGP_EXAM_pipeline_jenkinsfile" -Dsonar.host.url=http://localhost:9000 -Dsonar.token=sqp_a1735be799733783e5602715b221bb73496342fe'
        }
      }
    }
  }

  post{
    success{
      echo 'Pipeline with jenkinsfile successful'
    }
    failure{
      echo 'Pipleline failed'
    }
  }
}
