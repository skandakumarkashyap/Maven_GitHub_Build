pipeline {
    agent any

    stages {
        
        stage('Building') {
            
            steps {
                echo 'Build App'
            }
        }
        
        stage('Testing') {
            
            steps {
                echo 'Testing App'
            }
        }
        
        stage('Deploy') {
            
            steps {
                echo 'Deploy App'
            }
        }
    }
    
    post{
        
        always{
           emailext body: 'Summary', subject: 'Build status', to: 'skandakumarkashyapqa@gmail.com'
        }
        
    }
}
