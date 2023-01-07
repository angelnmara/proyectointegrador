FROM openjdk:12
MAINTAINER baeldung.com
COPY target/proyectointegrador-0.0.1-SNAPSHOT.jar proyectointegrador-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/proyectointegrador-0.0.1-SNAPSHOT.jar"]
