# CRUD Application with Java and Spring Boot

This project is a simple CRUD (Create, Read, Update, Delete) application developed using Java and Spring Boot. The application utilizes Maven as its build tool and MySQL as the database. The project adheres to a typical Spring Boot structure and employs the DAO (Data Access Object) pattern for handling database operations.

![1](https://github.com/baderbenlhachemi/cruddemo/assets/88034249/bd8d4921-cdb4-4426-aa19-c27d40640d14)
![2](https://github.com/baderbenlhachemi/cruddemo/assets/88034249/f42c2a52-1fc5-459c-96b9-23b0cb3226dd)
![3](https://github.com/baderbenlhachemi/cruddemo/assets/88034249/96f8b554-332e-45e8-9f3c-90d2ad2a3a4c)

## Overview of Main Components

### CruddemoApplication.java
- Main entry point of the application.
- Contains the main method to initiate the Spring Boot application.
- Defines a CommandLineRunner bean for executing code at application startup.

### StudentDAO.java
- Interface specifying operations on Student entities.
- Operations include creating a new student, finding a student by ID, retrieving all students, finding students by last name, updating a student's details, and deleting a student by ID or all students.

### StudentDAOImpl.java
- Implementation of the StudentDAO interface.
- Utilizes the EntityManager to interact with the database.
- Each method is annotated with @Transactional to ensure operations are performed within a transaction.

### Student.java
- Entity class representing a student in the application.
- Fields include the student's ID, first name, last name, and email.

## Architecture

The project architecture is straightforward. The CruddemoApplication class uses the StudentDAO to perform operations on Student entities. The actual implementation of StudentDAO interacts with the database to persist Student entities. The code adheres to clean code principles and emphasizes separation of concerns, ensuring each class has a specific responsibility and interacts with others through well-defined interfaces. This promotes code readability, testability, and maintainability.

## Configuration

The application.properties file contains database connection and logging configurations, specifying the MySQL database URL, username, and password. Additionally, it configures Hibernate to display SQL statements and binding parameters in the logs.

## Frameworks and Technologies

- Spring Boot: Provides features such as dependency injection, transaction management, and database integration.
- Jakarta Persistence API (JPA): Simplifies object-relational mapping for database operations.

## Build Tool

The project is built with Maven, handling dependencies and the build process. The pom.xml file contains Maven configuration, including dependencies and build plugins.
