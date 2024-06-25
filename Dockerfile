FROM alpine:latest
LABEL authors="Roy Matus"

RUN  apk update \
  && apk upgrade \
  && apk add ca-certificates \
  && update-ca-certificates \
  && apk add --update coreutils && rm -rf /var/cache/apk/*   \ \
  && apk add --update openjdk17 tzdata curl unzip bash \
  && apk add --no-cache nss \
  && rm -rf /var/cache/apk/*

COPY build/libs/demoRestApi-0.0.1-SNAPSHOT.jar /

EXPOSE 8080

ENTRYPOINT ["java","-jar","/demoRestApi-0.0.1-SNAPSHOT.jar"]