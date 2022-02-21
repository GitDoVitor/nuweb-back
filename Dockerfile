FROM openjdk:11

VOLUME /nuweb
ADD /target/nuweb-api.jar api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/api.jar"]