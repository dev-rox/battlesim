FROM eclipse-temurin:21-jdk-alpine-3.22 AS build

WORKDIR /app
COPY src/ src/
RUN javac -d out src/*.java

FROM eclipse-temurin:21-jre-alpine-3.22

WORKDIR /app
COPY --from=build /app/out/ ./

CMD ["java", "Main"]