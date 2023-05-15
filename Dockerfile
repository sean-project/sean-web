FROM openjdk:8-slim-buster as build

RUN mkdir -p /app
COPY . /app/
WORKDIR /app

RUN mvn package

FROM openjdk:8-jre-slim-buster

COPY --from=build sean-web-api/target/sean-web-api-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "sean-web-api-0.0.1-SNAPSHOT.jar"]