FROM openjdk:17-oracle
MAINTAINER com.student
WORKDIR /randomizer
RUN mvn package
COPY target/randomizer-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]