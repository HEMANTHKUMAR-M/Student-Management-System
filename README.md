# Student Management System

A full-stack web application developed using **Java, Spring Boot, React.js, and MySQL** to simplify student record management. The application provides an interface for managing student information, handling registrations, and performing CRUD operations with secure authentication and role-based access.

## 🚀 Project Overview

The Student Management System is designed to help administrators efficiently manage student information through a centralized web application.

It follows a client-server architecture where React.js handles the frontend, Spring Boot manages backend business logic and REST APIs, and MySQL stores student information.

## 🛠️ Tech Stack

| Technology      | Purpose                        |
| --------------- | ------------------------------ |
| Java            | Backend programming            |
| Spring Boot     | Backend framework              |
| React.js        | Frontend development           |
| MySQL           | Database management            |
| Spring Data JPA | Database connectivity          |
| REST APIs       | Frontend-backend communication |
| HTML & CSS      | UI development                 |
| Maven           | Dependency management          |
| Git & GitHub    | Version control                |

## ✨ Key Features

- **Student Registration and Login:** Provides user registration and login functionality.
- **Student Management:** Add, view, update, and delete student records.
- **CRUD Operations:** Performs complete Create, Read, Update, and Delete operations.
- **REST API Integration:** Connects the React frontend with the Spring Boot backend.
- **Database Management:** Stores and retrieves student information using MySQL and Spring Data JPA.
- **Form Validation:** Validates user inputs to maintain data accuracy.
- **Exception Handling:** Handles application errors and invalid requests.
- **Authentication:** Supports secure user authentication.
- **Role-Based Access:** Provides different access permissions based on user roles.

## 🏗️ System Architecture

The application follows a three-layer architecture:

1. **Frontend Layer – React.js**

   - User interface and student dashboard.
   - Registration and login forms.
   - Student record management.

2. **Backend Layer – Spring Boot**

   - REST API development.
   - Business logic implementation.
   - Authentication and validation.
   - Exception handling.

3. **Database Layer – MySQL**

   - Stores student details.
   - Manages user information.
   - Handles database operations through Spring Data JPA.

## 📂 Project Structure

```text
Student-Management-System/
│
├── frontend/
│   ├── public/
│   └── src/
│       ├── components/
│       ├── pages/
│       ├── services/
│       ├── App.js
│       └── index.js
│
├── backend/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/studentmanagement/
│           │       ├── controller/
│           │       ├── service/
│           │       ├── repository/
│           │       ├── entity/
│           │       ├── config/
│           │       └── exception/
│           │
│           └── resources/
│               └── application.properties
│
└── README.md
```

## ⚙️ Installation and Setup

### Prerequisites

Make sure the following tools are installed:

- Java JDK 17 or later
- Node.js and npm
- MySQL Server
- Maven
- Git

### 1. Clone the Repository

```bash
git clone https://github.com/Student Management System
Recommended project
Tech Stack: Java, Spring Boot, React.js, MySQL, REST APIs

Features:
- Student registration and login.
- Add, update, view and delete student records.
- REST API integration between React and Spring Boot.
- Database connectivity using Spring Data JPA.
- Form validation and exception handling.
- Authentication and role-based access.Student Management System
Recommended project
Tech Stack: Java, Spring Boot, React.js, MySQL, REST APIs

Features:
- Student registration and login.
- Add, update, view and delete student records.
- REST API integration between React and Spring Boot.
- Database connectivity using Spring Data JPA.
- Form validation and exception handling.
- Authentication and role-based access./Student-Management-System.git
```

```bash
cd Student-Management-System
```

### 2. Configure MySQL Database

Create a database in MySQL:

```sql
CREATE DATABASE student_management;
```

Configure your database credentials in:

`backend/src/main/resources/application.properties`

### 3. Run the Spring Boot Backend

```bash
cd backend
mvn spring-boot:run
```

### 4. Run the React Frontend

Open another terminal:

```bash
cd frontend
npm install
npm start
```

The frontend and backend will run on their configured local ports.

## 🔗 API Endpoints

Example REST API structure:

| HTTP Method | Endpoint           | Description       |
| ----------- | ------------------ | ----------------- |
| POST        | /api/auth/register | Register user     |
| POST        | /api/auth/login    | User login        |
| GET         | /api/students      | Get all students  |
| GET         | /api/students/{id} | Get student by ID |
| POST        | /api/students      | Add a student     |
| PUT         | /api/students/{id} | Update student    |
| DELETE      | /api/students/{id} | Delete student    |

*Note: These are proposed endpoint examples. Update them according to your actual backend implementation.*

## 🔮 Future Enhancements

- Student attendance management.
- Student performance tracking.
- Export student records to Excel and PDF.
- Dashboard with student statistics.
- Email notifications.
- Cloud deployment.

## 👨‍💻 Developer

**Hemanth Kumar M**

- GitHub: [https://github.com/HEMANTHKUMAR-M](https://github.com/HEMANTHKUMAR-M)
- LinkedIn: Add your LinkedIn profile URL

## 📄 License

This project is developed for educational and learning purposes.
