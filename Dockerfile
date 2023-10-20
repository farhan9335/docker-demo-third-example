FROM openjdk:8
EXPOSE 8084
ADD targer/docker-demo-third.jar docker-demo-third.jar
ENTRYPOINT [ "java","-jar","/docker-demo-third.jar" ]