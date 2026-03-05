# College Management System (Spring Boot)

## Description

This is a backend project for a College Management System built using **Spring Boot**, **Java**, and **MySQL**.
It provides REST APIs to manage students and users.

## Features

* Add student
* View all students
* Update student
* Delete student
* Authentication with Spring Security

## Technologies Used

* Java
* Spring Boot
* Spring Security
* MySQL
* Maven
* REST API

## Project Structure

controller → Handles API requests
service → Business logic
repository → Database interaction
entity → Database models

## How to Run

1. Clone the repository
2. Open in VS Code or IntelliJ
3. Configure MySQL in `application.properties`
4. Run:

mvn spring-boot:run

## API Endpoints

GET /students

POST /students

PUT /students/{id}

DELETE /students/{id}
