# Expense Tracker – Full Stack Assignment (IAURO Systems)

This project is a **Full Stack Expense Tracker application** developed as part of the assignment for **IAURO Systems Pvt. Ltd.**  
The application allows users to manage daily expenses with a simple authentication flow and a clean user interface.

The backend is built using **Java Spring Boot**, while the frontend is implemented using **HTML, CSS, and JavaScript**.

---

## Features

### Authentication (Frontend-based)
- User Signup
- User Login
- Authentication handled using browser `localStorage`
- Prevents unauthorized access to the expense page

### Expense Management
- Add new expenses (Category, Amount)
- View all expenses
- Expenses are stored and fetched from backend APIs
- Clean and user-friendly interface

### UI
- Simple and responsive UI
- Styled using inline CSS
- Separate pages for Login, Signup, and Expense Management

---

## Project Structure

IauroAssignment
├── Backend
│ ├── src/main/java/com/iauro/expensetracker
│ │ ├── ExpenseTrackerApplication.java
│ │ ├── AuthController.java
│ │ ├── ExpenseController.java
│ │ ├── Expense.java
│ │ ├── User.java
│ │ ├── ExpenseRepository.java
│ │ └── UserRepository.java
│ ├── src/main/resources
│ │ └── application.properties
│ └── pom.xml
│
├── Frontend
│ ├── login.html
│ ├── signup.html
│ └── expenses.html
│
└── README.md


---

## Technologies Used

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Maven

### Frontend
- HTML
- CSS
- JavaScript
- Browser `localStorage`

---

## How to Run the Project

### Prerequisites
- Java 17+
- Maven
- Any modern web browser

---

### Step 1: Run Backend

Open terminal inside the **Backend** folder:

```bash
cd Backend
mvn clean install
mvn spring-boot:run

Step 2: Run Frontend

Open the following files directly in a browser:

Frontend/signup.html
Frontend/login.html


After successful login, the user is redirected to:

expenses.html

API Endpoints
Authentication

POST /api/auth/signup

POST /api/auth/login

Expenses

GET /api/expenses

POST /api/expenses
