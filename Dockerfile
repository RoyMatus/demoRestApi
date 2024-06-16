FROM ubuntu:latest
LABEL authors="pilig"

RUN apt update -q && \
    apt install -y -q openjdk-17-jre openjdk-17-jdk-headless

COPY build/libs/demoRestApi-0.0.1-SNAPSHOT.jar /

EXPOSE 8080

ENTRYPOINT ["java","-jar","/demoRestApi-0.0.1-SNAPSHOT.jar"]