FROM maven:3.6.3-jdk-11

WORKDIR /app

ADD . /app
COPY cloud-config-storage /cloud-config-storage

RUN mvn clean package -Ddir=app
RUN mv target/cloud-config-server-1.0.0.jar cloud-config-server-1.0.0.jar

ENTRYPOINT ["sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/.urandom -jar cloud-config-server-1.0.0.jar"]
