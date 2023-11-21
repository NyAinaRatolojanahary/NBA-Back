FROM amazoncoretto:17
ARG WAR_FILE=targer/*.
COPY ${WAR_FILE} nba.jar
EXPOSE 8080
ENTRYPOINT ["java", ".jar","/nba.jar"]