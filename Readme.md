

> docker build -t mywebapp .
> docker run --rm -it -p 8888:8080 mywebapp

 visit http://localhost:8888/webapp

(close JSP server)
> ctrl + c 




# Connect to container

docker exec -it <container name> /bin/bash

> docker exec -it mywebapp /bin/bash



# Sample JSP
https://tomcat.apache.org/tomcat-7.0-doc/appdev/sample/
jar -xvf sample.war



https://tcserver.docs.pivotal.io/3x/docs-tcserver/topics/tutwebapp.html
/Documents/JavaServerPages/Dev/helloworld
> ant all



