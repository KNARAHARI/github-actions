FROM openjdk:11
EXPOSE 8080

WORKDIR /my-app
COPY ./my-app/build/libs/github-actions-1.0.jar ./

ENTRYPOINT ["java","-jar", "github-actions-1.0.jar"]
