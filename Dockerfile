FROM openjdk:11
EXPOSE 8080
COPY target/kafka-spring1-0.0.1-SNAPSHOT.jar kafka-spring1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/kafka-spring1-0.0.1-SNAPSHOT.jar"]
