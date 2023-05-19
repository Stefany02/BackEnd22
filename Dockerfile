FROM openjdk:17
EXPOSE 8080
MAINTAINER stefany
COPY target/Portfolio-0.0.1-SNAPSHOT.jar app-0.0.1.jar
ENTRYPOINT ["java","-jar","/app-0.0.1.jar"]