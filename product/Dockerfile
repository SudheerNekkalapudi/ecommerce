FROM openjdk:17
EXPOSE 8080
ADD dockerfile/target/product-image.jar product-image.jar
ENTRYPOINT ["java","-jar","/product-image.jar"]