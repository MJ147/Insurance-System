# Insurance System
An insurance agency system with relational database PostgreSQL.

## General info
The goal of the project is to create a platform for employees and clients of the insurance agency.
The application provides methods to create, read, update and delete data (CRUD). Data is saved in a relational database Postgres.
There are three roles in the application:
* Customer - has the option of adding himself to the database.
* Agent - has the ability to perform all CRUD operations on clients and insurance policies, except for delete. It can only create a request for delete to the manager.
* Manager - has all the functionality of the agent, can additionally perform CRUD operations on agents and delete data.
Both the agent and the manager have the ability to sort and filter data.
The application includes three types of insurance policies:
* Life insurance
* Vehicle insurance
* Home insurance

## Technologies
* Java 8
* Maven
* Spring 5
* Spring Boot 2
* PostgreSQL
