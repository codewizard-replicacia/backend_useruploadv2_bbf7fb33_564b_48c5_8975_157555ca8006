FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend_useruploadv2_bbf7fb33_564b_48c5_8975_157555ca8006 backend_useruploadv2_bbf7fb33_564b_48c5_8975_157555ca8006
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend_useruploadv2_bbf7fb33_564b_48c5_8975_157555ca8006/target/useruploadv2-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar useruploadv2-0.0.1-SNAPSHOT.jar"]