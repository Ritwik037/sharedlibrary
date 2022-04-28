def call(){
  sh 'docker ps'
  sh 'docker build -t ritwik72/sample:latest .'
  sh 'docker login -u ritwik72 -p Ritwik72@@'
  sh 'docker push ritwik72/sample:latest'
}  
