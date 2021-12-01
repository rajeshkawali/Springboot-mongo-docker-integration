FROM openjdk:8-jdk-alpine
EXPOSE 8090
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springboot-mongo-docker.jar
ENTRYPOINT ["java","-jar","/springboot-mongo-docker.jar"]