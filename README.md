# Student-Class Implementation

## 1. Project Overview

The Student-Class Implementation project is a Java-based application developed to demonstrate Object-Oriented Analysis and Design (OOAD) principles.

The main purpose of this project is to model the relationships between students, instructors, courses, and enrollments using object-oriented programming concepts.

## 2. Project Objectives

- To implement an object-oriented class structure.
- To demonstrate relationships between different classes.
- To improve code organization and reusability.
- To apply fundamental Object-Oriented Programming (OOP) principles.
- To create a maintainable and understandable software structure.

## 3. Technologies Used

- **Programming Language:** Java
- **Development Approach:** Object-Oriented Programming
- **Version Control:** Git and GitHub
- **Design:** UML Class Diagram

## 4. Class Structure

The project includes the following main classes:

- **Person:** Represents the common properties of individuals.
- **Student:** Represents students and their related information.
- **Instructor:** Represents instructors.
- **Course:** Represents courses and their information.
- **Enrollment:** Represents the relationship between students and courses.

## 5. Object-Oriented Programming Concepts

The project demonstrates the following OOP concepts:

- **Encapsulation:** Private fields, getters, and validation in constructors/setters (invalid values throw `IllegalArgumentException`).
- **Inheritance:** Reusing common properties through parent and child classes.
- **Abstraction:** Representing essential characteristics while hiding unnecessary implementation details.
- **Polymorphism:** Calling the same method (`displayDetails()`) on different `Person` subclasses (`Student`, `Instructor`) produces different behavior.
- **Modularity:** Organizing the application into separate classes.

## 6. Project Structure

```text
Student-Class-Implementation/
│
├── src/
│   ├── Person.java
│   ├── Student.java
│   ├── Instructor.java
│   ├── Course.java
│   ├── Enrollment.java
│   └── Main.java
│
├── docs/
│   └── UML.md
│
├── README.md
└── .gitignore
```

## 7. How to Run

1. Clone or download the repository.
2. Make sure JDK 11 or later is installed.
3. From the project root, compile and run:

```bash
javac -d out src/*.java
java -cp out Main
```

Alternatively, open the project in a Java IDE and run `Main.java`.

## 8. UML Design

The UML class diagram describing the relationships and structure of the project is available in the `docs` directory.

## 9. Repository

GitHub Repository:

https://github.com/20230678/Student-Class-Implementation

---

**Project:** Student-Class Implementation  
**Language:** Java  
**Course:** Object-Oriented Analysis and Design
