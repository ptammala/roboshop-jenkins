def call() {

    node('workstation')
            {
                sh "find . | sed -e '1d' | xargs rm -rf"
                git branch: "${BRANCH_NAME}", url: "https://github.com/ptammala/${component}"

                stage('Compile Code') {
                    common.compile()
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
