FROM tomcat:9.0
MAINTAINER diogonoda@hotmail.com

#RUN apt-get update \
# && apt-get install -y openjdk-8-jdk

WORKDIR /usr/src/app

ADD . /usr/src/app
