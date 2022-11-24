FROM anapsix/alpine-java 
COPY WeatherWidget-0.0.1-SNAPSHOT.jar /home/WeatherWidget-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","/home/WeatherWidget-0.0.1-SNAPSHOT.jar"]
