# Movie Database App

A Spring Boot web application for managing a movie database with create, read, update, delete, and search functionality.

## Overview

This project was built to practice Java web application development using Spring Boot, Spring MVC, Thymeleaf, Spring Data JPA, and MySQL. The application allows users to add movies, view a movie list, search movies by different criteria, view movie details, edit existing records, and delete movies. It follows a basic MVC structure with separate controller, model, repository, service, and template layers.

## Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Web Framework:** Spring MVC
- **Template Engine:** Thymeleaf
- **Database:** MySQL
- **ORM:** Spring Data JPA / Hibernate
- **Validation:** Jakarta Bean Validation
- **Build Tool:** Maven
- **Tools:** Git, GitHub, IntelliJ IDEA / Visual Studio Code

## Features

- Add new movies through a form
- View all movies in a list
- Search movies by title, genre, and minimum rating
- View detailed information for a selected movie
- Edit existing movie records
- Delete movie records
- Validate movie input fields such as title, genre, release year, rating, director, and duration
- Store movie data using MySQL and Spring Data JPA

## Project Structure

```text
MovieDatabaseApp/
├── MovieDatabaseApp/
│   ├── src/main/java/com/example/MovieDatabaseApp/
│   │   ├── controller/          # Handles web routes and user requests
│   │   ├── data/                # Repository and data loading logic
│   │   ├── model/               # Movie entity and genre enum
│   │   ├── service/             # Business logic layer
│   │   └── MovieDatabaseAppApplication.java
│   ├── src/main/resources/
│   │   ├── templates/           # Thymeleaf HTML views
│   │   ├── static/              # Static files such as CSS
│   │   └── application.properties
│   ├── pom.xml                  # Maven dependencies and project configuration
│   ├── mvnw                     # Maven wrapper for macOS/Linux
│   └── mvnw.cmd                 # Maven wrapper for Windows
└── README.md
```

## Pages and Routes

| Method | Route | Description |
|---|---|---|
| GET | `/` | Home page |
| GET | `/add` | Display form to add a new movie |
| POST | `/add` | Submit a new movie |
| GET | `/movies` | View all movies |
| GET | `/search` | Search movies by title, genre, or minimum rating |
| GET | `/movies/{id}` | View details for a specific movie |
| GET | `/movies/edit/{id}` | Display form to edit a movie |
| POST | `/movies/edit/{id}` | Submit updated movie information |
| GET | `/movies/delete/{id}` | Display delete confirmation page |
| POST | `/movies/delete/{id}` | Delete a movie |

## Movie Fields

Each movie record includes:

- Title
- Genre
- Release year
- Rating
- Director
- Duration in minutes

## Getting Started

### Prerequisites

- Java 21 or later
- Maven or Maven Wrapper
- MySQL
- IntelliJ IDEA, Visual Studio Code, or another Java IDE

### Database Setup

The project uses MySQL. Before running the application, make sure MySQL is running and create a database named `mydb`.

Example:

```sql
CREATE DATABASE mydb;
```

Then check the database settings in:

```text
MovieDatabaseApp/src/main/resources/application.properties
```

Update the username and password if your local MySQL setup is different.

### Run Locally

Clone the repository:

```bash
git clone https://github.com/MichaelLauSheridan/MovieDatabaseApp.git
cd MovieDatabaseApp/MovieDatabaseApp
```

Run the application with the Maven wrapper.

For Windows:

```bash
mvnw.cmd spring-boot:run
```

For macOS/Linux:

```bash
./mvnw spring-boot:run
```

Or, if Maven is installed globally:

```bash
mvn spring-boot:run
```

Open the application in your browser:

```text
http://localhost:8080
```

## What I Learned

Through this project, I practiced:

- Building a Java web application with Spring Boot
- Using Spring MVC controllers to handle page routes and form submissions
- Creating entity models with validation rules
- Using Spring Data JPA to interact with a relational database
- Building Thymeleaf templates for server-rendered pages
- Separating code into controller, model, repository, and service layers
- Implementing CRUD functionality in a full-stack web application

## Future Improvements

- Improve the visual design of the user interface
- Add user authentication and account-based movie lists
- Add pagination and sorting for the movie list
- Add more advanced search filters
- Add automated unit and integration tests
- Add screenshots or a short demo GIF
- Improve database configuration for easier local setup
