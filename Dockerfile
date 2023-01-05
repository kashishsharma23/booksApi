FROM openjdk:11
LABEL maintainer="kashish"
ADD booksapi-0.0.1-SNAPSHOT.jar booksapi.jar
ENTRYPOINT ["java", "-jar", "booksapi.jar"]
