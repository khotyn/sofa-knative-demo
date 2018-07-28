FROM openjdk:8-jdk-alpine
ARG JAR_FILE
ADD ./target/sofa-knative-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar"]