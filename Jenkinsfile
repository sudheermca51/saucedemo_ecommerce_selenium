pipeline {
    agent any
    stages {
        stage('healthcheck'){
				steps{
				     echo 'Performing healthCheck'
					bat ' ping 85.209.95.122 -n 5'
				}
			}
		stage('download_selenium_code'){
		steps{
		    git branch: 'main', url: 'https://github.com/sudheermca51/saucedemo_ecommerce_selenium.git'
	 	}
		}
		 stage('execute_selenium_tests') {
            steps {
                 dir('seleniumproject') {
                           bat 'mvn clean test'
                    }
            }
        }
    }
}
