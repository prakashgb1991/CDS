# Citizen Disbursement System (CDS)  using Spring Boot and H2 In memory database

Run com.cds.CDSServiceApplication as a Java Application.

Runs on default port of Spring Boot - 8080 

## Can be run as a Jar or docker Image

`mvn clean install` generate a jar in target and run the jar.

or

use docker command : docker run prakashgb1991/citizen-distribution-system


## H2 Console

- http://localhost:8080/h2-console
- Use `jdbc:h2:mem:testdb` as JDBC URL 
- Use username: sa , password: password

## MySQL

- properties to connect to MySQL is provided in application.properties

## JUnit result

![alt text](https://github.com/prakashgb1991/cds/blob/master/2020-07-01_14h57_54.png)
