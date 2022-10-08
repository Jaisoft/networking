open -a docker

minikube start

brew install istioctl

curl -L https://istio.io/downloadIstio | sh -

cd istio-1.14.0

istioctl install --set profile=demo -y

kubectl label namespace default istio-injection=enabled

cd callme-service

mvn clean package

eval $(minikube docker-env)

docker build -t callme-service:latest

apply -f /k8s/istio-rules.yaml

apply -f /k8s/deployment.yaml

cd caller-service

mvn clean package

eval $(minikube docker-env)

docker build -t caller-service:latest

apply -f /k8s/istio-rules.yaml

apply -f /k8s/deployment.yaml

minikube tunnel

curl -v -H "Host:caller.example.com" http://localhost/caller/ping


*   Trying 127.0.0.1:80...
* Connected to localhost (127.0.0.1) port 80 (#0)
> GET /caller/ping HTTP/1.1
> Host:caller.example.com
> User-Agent: curl/7.79.1
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< content-type: text/plain;charset=UTF-8
< content-length: 55
< date: Sat, 04 Jun 2022 13:44:38 GMT
< x-envoy-upstream-service-time: 30
< server: istio-envoy
< 
* Connection #0 to host localhost left intact
I'm caller-service v1. Calling... I'm callme-service v2% 







lskadjfalñsdjflñajsfkjhkljhlkjlkhlhlhlhlhlh