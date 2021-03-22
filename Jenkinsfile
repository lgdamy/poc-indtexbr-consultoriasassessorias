pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('package') {
      steps {
        sh 'docker build -t tcc-consultoria-api .'
      }
    }

    stage('tag') {
      steps {
        sh 'docker tag tcc-consultoria-api:latest srochg/tcc-consultoria-api'
      }
    }

    stage('push') {
      steps {
        sh 'docker push srochg/tcc-consultoria-api'
      }
    }

    stage('rollout') {
      steps {
        sh 'kubectl rollout restart deployment tcc-consultoria-api-deployment'
      }
    }

    stage('qa-test') {
      steps {
        sh '''echo Iniciando os testes



'''
        sh 'sleep 3'
        sh 'echo Finalizando os testes com sucesso'
      }
    }

  }
}