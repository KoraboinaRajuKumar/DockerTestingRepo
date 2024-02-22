FROM openjdk:17-jdk-slim-buster

COPY target/dockertesting.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "dockertesting.jar"]