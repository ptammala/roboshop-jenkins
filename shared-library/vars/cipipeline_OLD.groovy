def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def call(message) {

    node('workstation')
            {
                stage('Compile Code') {
                    print 'Hello World'
                }
                stage('Test') {
                    print 'Hello World'
                }
                stage('Code Quality') {
                    print 'Hello World'
                }
                stage('Compile Security') {
                    print 'Hello World'
                }
                stage('Release') {
                    print 'Hello World'
                }
            }
}




    pipeline {
        agent any

        stages {
            stage('Compile') {
                steps {
                    sh 'env'

                }
            }
            stage('Test') {
                when{
                    allOf{
                        expression{ env.BRANCH_NAME != null }
                        expression{ env.TAG_NAME == null }

                    }

                }
                steps {
                    echo 'Hello World'
                }
            }
            stage('Code Quality') {
                when{
                    allOf{
                        expression{ env.BRANCH_NAME != null }
                        expression{ env.TAG_NAME == null }

                    }

                }

                steps {
                    echo 'Hello World'
                }
            }
            stage('Code Security') {
                when {
                    expression { BRANCH_NAME == 'main' }
                }
                steps {
                    echo 'Hello World'
                }
            }
            stage('Release') {
                when{
                    expression{ env.TAG_NAME ==~ ".*"}
                }

                steps {

                    echo 'Hello World'
                    sh 'env'

                }
            }
        }
    }

}