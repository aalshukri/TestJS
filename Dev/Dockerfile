FROM tomcat:9.0.1-jre8-alpine

# For First webapp
ADD ./webapp /usr/local/tomcat/webapps/webapp

# For First webapp
ADD ./firstapp /usr/local/tomcat/webapps/firstapp

#ADD ./sample.war /usr/local/tomcat/webapps/sample.war
ADD ./sample /usr/local/tomcat/webapps/sample

ADD ./helloworld /usr/local/tomcat/webapps/helloworld

CMD ["catalina.sh", "run"]
