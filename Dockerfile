FROM openjdk:17-oracle
RUN mvn package
ENTRYPOINT ["java","-jar","target/randomizer-0.0.1-SNAPSHOT.jar"]