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
                when {
                    expression { BRANCH_NAME == "*." }
                }
                steps {
                    echo 'Hello World'
                }
            }
            stage('Code Quality') {
                when {
                    anyOf {
                        expression { env.BRANCH_NAME != null }
                        expression { env.TAG_NAME == null }
                    }
                }
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
                when {
                    expression { env.TAG_NAME ==~ "*." }
                }

                steps {

                    echo 'Hello World'
                    sh 'env'

                }
            }
        }
    }

}