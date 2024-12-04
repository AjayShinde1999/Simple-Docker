FROM openjdk:11

EXPOSE 8080

ADD target/simple-docker.jar simple-docker.jar

ENTRYPOINT ["java","-jar","simple-docker.jar"]