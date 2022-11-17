FROM node:boron


RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app




SHELL ["/bin/bash", "--login", "-c"]

RUN curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.35.3/install.sh | bash
RUN nvm install 10.15.3

COPY package.json package.json
RUN npm install

# Bundle app source
COPY . /usr/src/app

EXPOSE 8080
CMD npm install
CMD mvn package
CMD mvn spring-boot:run