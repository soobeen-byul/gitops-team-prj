FROM eclipse-temurin:17-jdk-alpine

ARG VER
ARG STG

COPY "build/libs/demo-0.0.1-SNAPSHOT.jar" app.jar

#ENTRYPOINT ["java","-Dspring.profiles.active=dev", "-jar","/app.jar"]
ENTRYPOINT ["java","-Dspring.profiles.active=${STG}", "-jar","/app.jar"]