FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
ARG JAR_FILE=build/libs/spring-boot-postgre-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} test-app.jar
ENTRYPOINT ["java","-jar","/test-app.jar"]
