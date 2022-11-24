
COPY package.json package.json
RUN npm install

# Bundle app source
COPY . /usr/src/app

EXPOSE 8080
CMD npm install

CMD mvn spring-boot:run
