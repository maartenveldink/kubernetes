echo This script assumes that you have minikube installed on your path and running
echo If not, start minikube using:  minikube start --driver=hyperv


echo Deleting proxy settings:
env | grep proxy
unset http_proxy
unset https_proxy
unset no_proxy
echo Proxy settings deleted:
env | grep proxy


echo Set alias kubectl to use minikube internal kubectl version
alias kubectl='minikube kubectl --'
echo Verifying:
kubectl get nodes
