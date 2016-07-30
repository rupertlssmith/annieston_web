# Build image with:  docker build -t rupertlssmith/jessie_annieston:v1 .
 
FROM rupertlssmith/jessie_java8:v1        
MAINTAINER Rupert Smith, https://github.com/rupertlssmith
RUN apt-get update && \
    apt-get install -y maven git && \
    apt-get clean

RUN git clone https://github.com/rupertlssmith/annieston_web.git
RUN cd annieston_web && mvn clean install

EXPOSE 8080

CMD mvn jetty:run