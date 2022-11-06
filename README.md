# About

The project allows you to easily manage service reports about equipment purchased in a given store. 

## Technologies
- Java 17
- Maven
- Spring Boot
- Spring Security
- Hibernate
- MySQL
- BCrypt
- Thymeleaf

## Main functionalities
Only authorized users can use the application. Depending on user role, program delivers various functionalities. 

A separate page is assigned for the registration of new users, which then, after successfully registering the user, gives access to the application

NOT AUTHORIZED:
- account registration 
- logging

USER:
- viewing reports list
- adding new reports
- viewing service diagnosis of the report

TECHNICIAN:
- viewing reports list
- adding service diagnosis of the report
- viewing service diagnosis of the report

## Getting started
Program was designed to work with relational databases like MySQL. 
App need some additional configuration data to work properly. 

