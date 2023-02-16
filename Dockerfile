FROM adoptopenjdk/openjdk11
EXPOSE 8080
ADD /target/*.jar forum.jar
ENTRYPOINT ["java", "-jar", "forum.jar"]