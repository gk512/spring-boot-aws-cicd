FROM openjdk:17
WORKDIR /app
COPY ./target/springboot-eks.jar  /app
EXPOSE 8080
CMD [ "java","-jar","springboot-eks.jar" ]