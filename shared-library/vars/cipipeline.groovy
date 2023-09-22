def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def call(message)
{

    pipeline {
        agent any

        stages {
            stage('Compile') {
                steps {
                    sh 'env'

                }
            }
            stage('Test') {
                steps {
                    echo 'Hello World'
                }
            }
            stage('Code Quality') {
                steps {
                    echo 'Hello World'
                }
            }
            stage('Code Security') {
                steps {
                    echo 'Hello World'
                }
            }
            stage('Release') {
                steps {
                    echo 'Hello World'
                }
            }
        }
    }

}