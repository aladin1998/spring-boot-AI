# Stage 1: Ollama setup and model pulling
FROM ollama/ollama:latest

# Pull the required model
#RUN ollama pull deepseek-r1

# Run the model (if required in this stage, otherwise move this to the second stage)
#RUN ollama run deepseek-r1


# Stage 2: Spring Boot setup
FROM openjdk:21

# Set working directory inside the container for Spring Boot
WORKDIR /app

# Copy Maven files and dependencies
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Pre-fetch dependencies for Spring Boot
RUN ./mvnw dependency:go-offline

# Copy the source code for the Spring Boot application
COPY src ./src


# Run the Spring Boot app
CMD ["./mvnw", "spring-boot:run"]

# Expose port for the Spring Boot application
EXPOSE 8080