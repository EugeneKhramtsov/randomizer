FROM openjdk:17-oracle
RUN ./mvnw package
ENTRYPOINT ["java","-jar","target/randomizer-0.0.1-SNAPSHOT.jar"]