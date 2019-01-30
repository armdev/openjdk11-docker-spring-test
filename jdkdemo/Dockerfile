FROM openjdk:11-jdk-slim
#FROM openjdk:10-jdk
COPY target/jdkdemo.jar /opt/jdkdemo.jar
ENTRYPOINT ["java", "-Xmx128m", "-Xss256m",  "-jar","/opt/jdkdemo.jar"]
EXPOSE 9595
