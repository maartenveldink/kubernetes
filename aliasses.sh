alias tetris='minikube service tetris-service --url'

function logs { kubectl logs -l=app.kubernetes.io/name="$1" --tail=1000; }
export -f logs
