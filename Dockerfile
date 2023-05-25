FROM amazoncorretto:17
MAINTAINER stefany
COPY target/stefany-0.0.1-SNAPSHOT.jar stefany-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/stefany-0.0.1-SNAPSHOT.jar"]