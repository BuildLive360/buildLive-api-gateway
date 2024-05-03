FROM openjdk:17
EXPOSE 7070
ADD target/buildlive-apigateway.jar buildlive-apigateway.jar
ENTRYPOINT ["java", "-jar","/buildlive-apigateway.jar"]