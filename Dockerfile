# # Use an official OpenJDK runtime as a base image
# FROM openjdk:11-jre-slim

# # Set the working directory to /app
# WORKDIR /app

# # Copy the executable JAR file into the container at /app
# COPY target/Gradebook-0.0.1-SNAPSHOT.jar /app

# #target\Gradebook-0.0.1-SNAPSHOT.jar

# # Specify the command to run on container start
# CMD ["java", "-jar", "Gradeboook-0.0.1-SNAPSHOT.jar"]

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/Gradebook-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080