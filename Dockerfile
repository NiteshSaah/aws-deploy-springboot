#Use a base image with the Java runtime
FROM amazoncorretto:17-alpine
RUN apk add curl
#Set the working directory inside the container
VOLUME /tmp
#Expose the port your application listen on
EXPOSE 8080
# Copy the Spring Boot jar file into the container
ADD target/aws-deploy-springboot-service.jar aws-deploy-springboot-service.jar
# Command to run the application
ENTRYPOINT ["java","-jar","/aws-deploy-springboot-service.jar"]