FROM java:8
VOLUME /tmp
COPY target/TestProject.jar TestProject.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/TestProject.jar"]
