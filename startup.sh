echo This script assumes that you have minikube installed on your path

echo Deleting proxy settings:
env | grep proxy
unset http_proxy
unset https_proxy
unset no_proxy
echo Proxy settings deleted:
env | grep proxy


echo Starting minikube...
minikube start --driver=hyperv


echo Set alias kubectl to use minikube internal kubectl version
alias kubectl='minikube kubectl --'
echo Verifying:
kubectl get nodes

alias tetris='minikube service tetris-service --url'

