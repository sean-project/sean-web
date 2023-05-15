FROM maven:3.3.9 as build

RUN mkdir -p /app
COPY . /app/
WORKDIR /app

RUN mvn package
RUN ls
FROM openjdk:8

COPY --from=build /app/sean-web-api/target/sean-web-api-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "sean-web-api-0.0.1-SNAPSHOT.jar"]