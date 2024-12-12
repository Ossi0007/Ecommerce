# Use official OpenJDK image from Docker Hub
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file built by Maven or Gradle
COPY target/payment-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app will run on
EXPOSE 8087

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
