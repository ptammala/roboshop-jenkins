def call() {

    node('workstation')
            {
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
