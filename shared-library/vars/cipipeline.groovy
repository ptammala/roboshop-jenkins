def call() {

    node('workstation')
            {
                sh "find . | sed -e '1d' |xarg rm -rf"
                git branch: 'main', url: "https://github.com/ptammala/${component}"

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
