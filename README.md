# SportsTeamQueryService-Jib
Java EE Microservice project using Jib and Payara Micro for distribution.

Configuration:  This example utilizes a local Apache Derby database.  Ensure that Apache Derby is installed on the host machine running on port 1527.  Next, create a database named ACME and a user named ACMEUSER.  Finally, connect as ACMEUSER and run the SQL contained within the sql/create.sql file to set up the database.

Add the derbyclient.jar file into the src/main/jib folder before building and deploying. 

To build the project, utilize the command:

<pre>
mvn compile jib:dockerBuild
</pre>

Once the image is built, it can be started on a local Docker instance using the command:

<pre>
docker run -d -p 8080:8080 sportsteamqueryservice 
</pre>

**Note that this project relies upon the Docker for Mac configuration to bind the host networking to the container.  The DOCKER_HOST environment variable within the POM file will need to be modified if not using a Mac.
