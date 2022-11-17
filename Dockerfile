FROM ubuntu:18.04
COPY . /app
RUN npm install
CMD npm install
CMD mvn package
CMD mvn spring-boot:run