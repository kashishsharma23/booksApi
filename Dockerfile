FROM openjdk:11
LABEL maintainer="kashish"
ADD target/booksApi-0.0.1-SNAPSHOT.jar booksapi.jar
ENTRYPOINT ["java", "-jar", "booksapi.jar"]
