FROM gradle:jdk19-alpine AS build
WORKDIR /home/gradle/project/
COPY . /home/gradle/project/
WORKDIR /home/gradle/project/mep
RUN gradle --no-daemon bootJar

FROM openjdk:19
COPY --from=build /home/gradle/project/mep/build/libs/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
