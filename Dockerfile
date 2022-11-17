FROM node:boron


RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

# Install app dependencies
COPY package.json package.json
RUN npm install

# Bundle app source
COPY . /usr/src/app

EXPOSE 8080
CMD npm install
CMD mvn package
CMD mvn spring-boot:run