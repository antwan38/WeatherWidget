FROM maven:3.8.4-openjdk-17 as maven-builder
COPY src /app/src
COPY pom.xml /app

RUN mvn -f /app clean package -DskipTests
FROM openjdk:17-slim-bullseye

COPY --from=maven-builder app/target/WeatherWidget-0.0.1-SNAPSHOT.jar /app-service/WeatherWidget-0.0.1-SNAPSHOT.jar
WORKDIR /app-service

EXPOSE 8080
ENTRYPOINT ["java","-jar","WeatherWidget-0.0.1-SNAPSHOT.jar"]
