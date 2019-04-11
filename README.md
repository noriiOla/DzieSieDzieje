# DzieSieDzieje
### Before run
#### Software requirements
* Java 11 
* Maven 3
* Tomcat 8.5.*
* MySQL (Server w/ Java Connector)

#### Used technologies
* Java 
* Spring Boot 
* Hibernate
* MapStruct
* Swagger
* MySQL database

#### Database configuration
The database should run on port **3306**. 
```
mysql> create database dziesiedzieje; -- Create the new database
mysql> create user 'db_user'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on dziesiedzieje.* to 'springuser'@'%'; -- Gives all the privileges to the new user on the newly created database
```
Next run schema.sql script to create database schema.
####Tomcat configuration 
```
mvn clean install
```
Next add new Tomcat configuration, configure port as **8080**, set JRE and in Deployment tab add **war:exploded**.
####Examples of simple requests   
Open **api.http** file and run requests.  
NOTE: Only Intellij fetcher. 