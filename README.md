# Spring Boot Application with DeepSeek and Ollama (Offline Mode using Docker-Compose)

This repository contains a Spring Boot application that integrates DeepSeek and Ollama for offline machine learning and natural language processing tasks. The application is designed to run locally using Docker-Compose, ensuring a seamless and isolated development environment.

## Overview
DeepSeek: A powerful library for natural language understanding and processing.

Ollama: A lightweight machine learning framework optimized for offline use.

Docker-Compose: Simplifies the setup and deployment of the application and its dependencies in a containerized environment.

This setup allows you to run the application entirely offline, making it ideal for environments with limited or no internet access.

## Prerequisites
Before you begin, ensure you have the following installed:

- Docker

- JDK 21 or higher

- Maven

## Getting Started

1. Clone the Repository

git clone https://github.com/aladin1998/spring-boot-AI.git

`
cd deepseek
`

2. Set Up Docker-Compose

To start the App, run:

`
 docker-compose -f compose.yaml up --build
`

This will build the Docker images and start the containers.

3. Access the Application

Once the containers are running, the Spring Boot application will be accessible at:
`
http://localhost:8080/api/chat/{prompt}
`

example:
`
http://localhost:8080/api/chat/hello
`