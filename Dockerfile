FROM openjdk:11
EXPOSE 8080
ADD target/jenkinsexample.jar jenkinsexample.jar
ENTRYPOINT ["java","-jar","/jenkinsexample.jar"]