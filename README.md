# 🏫 Campus Care – Campus Management System

Campus Care is a full-stack web application developed using **Java Spring Boot** that simplifies campus facility management by allowing students to submit complaints and enabling administrators to manage, track, and resolve them efficiently.

---

## 📌 Features

### 👨‍🎓 Student Module
- Student Registration & Login
- Secure Authentication
- Submit Campus Complaints
- View Complaint Status
- Update Personal Profile

### 👨‍💼 Admin Module
- Admin Login
- View All Complaints
- Update Complaint Status
- Manage Student Records
- Dashboard for Complaint Management

---

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

### Database
- MySQL

### Frontend
- HTML5
- CSS3
- JavaScript
- Thymeleaf

### Tools
- IntelliJ IDEA
- Maven
- Git
- GitHub
- Postman

---

## 📂 Project Structure

```
CampusCare
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── controller
│   │   │   ├── service
│   │   │   ├── repository
│   │   │   ├── entity
│   │   │   ├── config
│   │   │   └── CampusCareApplication.java
│   │   │
│   │   ├── resources
│   │   │   ├── templates
│   │   │   ├── static
│   │   │   └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/yourusername/CampusCare.git
```

### Navigate to Project

```bash
cd CampusCare
```

### Configure Database

Create a MySQL database.

```sql
CREATE DATABASE campuscare;
```

Update **application.properties**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/campuscare
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

## 📸 Screenshots

Add screenshots here.

Example:

- Home Page
- Student Login
- Student Dashboard
- Complaint Registration
- Admin Dashboard
- Complaint Status

---

## 🔄 Workflow

1. Student registers/login.
2. Student submits a complaint.
3. Complaint is stored in MySQL database.
4. Admin views pending complaints.
5. Admin updates complaint status.
6. Student can check updated complaint status.

---

## 🗄️ Database

Main Tables

- Student
- Admin
- Complaint

Relationships are managed using Spring Data JPA and Hibernate.

---

## 🔐 Security

- Secure Login Authentication
- Password Validation
- Input Validation
- Session Management

---

## 🚀 Future Enhancements

- Email Notifications
- SMS Alerts
- Complaint Priority Levels
- Department-wise Complaint Management
- File/Image Upload
- Dashboard Analytics
- JWT Authentication
- Role-Based Access Control
- Cloud Deployment (AWS/Render)

---

## 📚 Learning Outcomes

Through this project, I gained practical experience in:

- Java Programming
- Object-Oriented Programming
- Spring Boot
- Spring MVC
- Hibernate
- RESTful Architecture
- Spring Data JPA
- CRUD Operations
- MySQL Database
- Maven
- Git & GitHub
- Backend Application Development

---

## 👨‍💻 Author

**Pasupuleti Jnana Manikanta Pavan Kumar**

Java Backend Developer

- LinkedIn: https://www.linkedin.com/in/manikanta-pasupuleti
- GitHub: https://github.com/ManikantaPasupuleti2326

---

## ⭐ If you like this project

Please consider giving it a **Star ⭐** on GitHub.
