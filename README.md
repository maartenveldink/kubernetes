# Introduction
This repository is set up to facilitate a Kubernetes workshop. It contains a minimal web-application packaged in a Docker container. 
The web-server serves a game of Tetris to the user

## Install Minikube
The workshop uses Minikube to setup a Kubernetes cluster on your local machine. 
Please go through the steps on: https://kubernetes.io/docs/tasks/tools/install-minikube/ and install minikube. 

Also make sure that minikube is on your path. 

## Build Docker image locally
Before we continue with the workshop, please compile the Maven project and build the Docker-container.
If you do not have Maven, please notify me. 

Tag the Docker-container with the tag 'tetris:latest'. 
The availability of an image with that tag is assumed throughout the workshop.  

