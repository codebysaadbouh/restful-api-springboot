## Building a RESTful Microservice API with Spring Boot 
##### #JavaCoding
Description : 
The aim of this mini project is to understand how Springboot works and to set up a small RESTful API.
>Spring Boot is a framework that allows you to quickly start developing applications or services by providing the necessary dependencies and auto-configuring them.
#### Compilation : Gradle War
#### Editor : Intellij IDEA
#### Database : Mysql  
> Create a **"user"** database, and import the file **user.sql**
#### #in Application.propreties file 
```
#Databasse
spring.datasource.url=jdbc:mysql://localhost:3306/user?useSSL=false&serverTimezone=UTC
spring.datasource.username={your-username-database}
spring.datasource.password={your-password-database}
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

#### Reference Documentation  
* [Official Gradle documentation](https://docs.gradle.org)  
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.0/gradle-plugin/reference/html/)  
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.0/gradle-plugin/reference/html/#build-image)  
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)  
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-developing-web-applications)  
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-jpa-and-spring-data)  
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-sql)  
* [Spring Data JDBC](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/)

---

>Author : Cheikh Saad Bouh SOW -
>Contact : saadbouh.code@gmail.com
