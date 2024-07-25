# Spring Boot CRUD API with File System :
# CrudRestSpringBootProj
    This repository contains a Spring Boot application that provides a CRUD (Create, Read, Update, Delete) API for managing students.
    The application uses a text file as the data store instead of a traditional database.
    The application manages student records using a simple text file (`students.txt`) as the data store.
    Each student record consists of an ID, name, email, and course. The API allows for creating, reading, updating, and deleting student records.
    
      - **StudentController.java**: Handles HTTP requests and maps them to the appropriate service methods.
      - **Student.java**: Represents the Student entity.
      - **StudentService.java**: Contains the business logic for managing student records.
      - **application.properties**: Contains application configuration properties.
      - **students.txt**: The text file used as the data store.
         all these files are present in their respective packages in com.rest.springboot.file
         
            apis for crud operation : http://localhost:8080/api/students
                -Create/Post:- http://localhost:8080/api/students
                -Get all/Read:- http://localhost:8080/api/students
                -Get by id/Read:- http://localhost:8080/api/students/{id}
                -Update/Put:- http://localhost:8080/api/students/{id}
                -Delete:- http://localhost:8080/api/students/{id}
------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Spring Boot CRUD API with Database System :
# RESTSpringBootCRUDProj
    This repository contains a Spring Boot application that provides a CRUD (Create, Read, Update, Delete) API for managing students.
    The application uses a  database MySql to store data and perform operations on it.
    The application manages student records using a simple table file students data store.
    Each student record consists of an ID, name, age. The API allows for creating, reading, updating, and deleting student records.
    
- **StudentController.java**: Handles HTTP requests and maps them to the appropriate service methods.
- **Student.java**: Represents the Student entity.
- **StudentService.java**: Contains the business logic for managing student records.
- **application.properties**: Contains application configuration properties.
- **students.txt**: The text file used as the data store.
- 
       all these files are present in their respective packages in com.rest.springboot.file
          apis for crud operation : http://localhost:8080/api/students
              -Create/Post:- http://localhost:8080/api/students/create
              -Get all/Read:- http://localhost:8080/api/students/student/allstudents
              -Get by id/Read:- http://localhost:8080/api/students/student/{studID}
              -Update/Put:- http://localhost:8080/api/students/student/{studID}/{newName:.+}
              -Delete:- http://localhost:8080/api/students/student/{studID}
