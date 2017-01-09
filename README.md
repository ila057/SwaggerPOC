# Swagger UI Usage Example
Basic Swagger UI implementation (with Intellij Jetty plugin, jersey 1.9 and gradle build tool)

One can understand how the jersey services work and how to initialize swagger UI for understanding its basic functionality.

To see the swagger UI, start jetty server (preferably through Intellij plugin) and go to the link in http://localhost:7070/Swagger/#!/hello/getUser. 

You may see the API responses here : http://localhost:7070/Swagger/home/resources/sampleRequest/8/

If you decide to change the Swagger annotations, then download the new swagger.yaml file from http://localhost:7070/Swagger/api/swagger.yaml and copy-paste this file in WEB-INF folder of the project.
Build and Restart the jetty server, your changes should be reflected in http://localhost:7070/Swagger/#!/hello/getUser.

<hr>
References: <br>
1. Basic Understanding of what Swagger does: http://idratherbewriting.com/pubapis_swagger/ <br>
2. How Swagger Works: https://tech.homeaway.com/development/2016/06/02/generating-swagger-spec.html <br>
3. List of things Swagger does: http://swagger.io/open-source-integrations/ <br>
4. For integration with Maven and Tomcat : http://stackoverflow.com/questions/25776968/how-to-integrate-swagger-with-maven-java-jersey-tomcat <br>
5. The official documentation : https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-Jersey-1.X-Project-Setup-1.5 <br>
6. For examples on Swagger annotations : http://docs.swagger.io/service/java/tomcat-jersey-1.html
