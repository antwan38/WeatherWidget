FROM anapsix/alpine-java 
COPY . /usr/src/app
EXPOSE 8080
CMD ["java","-jar","/usr/src/app/target/WeatherWidget-0.0.1-SNAPSHOT.jar"]
