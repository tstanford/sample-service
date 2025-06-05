## Reference
https://octopus.com/devops/kubernetes-deployments/

## create the deployment

```bash
kubectl apply -f sample-service-deployment.yaml
```

## verify the deployment
```bash
kubectl get deployments
```

## Monitor the rollout status

```bash
kubectl rollout status deployment/sample-service-deployment
```


## Check the ReplicaSets

```bash
kubectl get rs
```

## See the pods

```bash
kubectl get pods --show-labels
```



## bash history

```bash
kubectl apply -f sample-service-deployment.yaml
kubectl get deployments
kubectl rollout status deployment/sample-service-deployment
kubectl get deployments
kubectl get nodes
kubectl logs -l app=sample-service
docker run -d -p 5000:5000 --restart=always --name registry registry:2
docker images
docker tag sample-service:latest localhost:5000/sample-service
docker push localhost:5000/sample-service:latest
kubectl rollout status deployment/sample-service-deployment
kubectl apply -f sample-service-deployment.yaml
kubectl rollout status deployment/sample-service-deployment
docker images
kubectl get deployments
kubectl get pods
kubectl apply -f sample-service-deployment.yaml
kubectl expose deployment sample-service-deployment --type=LoadBalancer --port=8080
kubectl get service
kubectl logs -l app=sample-service

```
