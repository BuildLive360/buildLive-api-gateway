FROM openjdk:17
EXPOSE 7070
ADD target/buildLive-apigateway.jar buildLive-apigateway.jar
ENTRYPOINT ["java", "-jar", "/buildLive-apigateway.jar"]