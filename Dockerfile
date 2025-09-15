FROM openjdk:17-oracle
MAINTAINER com.student
RUN ls
RUN mvn package
COPY target/randomizer-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]