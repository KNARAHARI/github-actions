FROM openjdk:11
EXPOSE 8080

WORKDIR /redirects-health-monitor
COPY ./redirects-health-monitor/build/libs/github-actions-1.0.jar ./

ENTRYPOINT ["java","-jar", "github-actions-1.0.jar"]
