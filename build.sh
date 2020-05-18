mvn clean install -DskipTests
docker build -t tetris:latest .
minikube kubectl -- delete -f deployment/deployment.yaml
minikube kubectl -- apply -f deployment/deployment.yaml
