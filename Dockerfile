FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/TestProject.jar TestProject.jar
EXPOSE 8100
ENTRYPOINT ["java","-jar","/TestProject.jar"]
