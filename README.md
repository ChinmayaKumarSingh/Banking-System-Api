# 🏦 Banking System API

![Java](https://img.shields.io/badge/Java-17-orange)
![SpringBoot](https://img.shields.io/badge/SpringBoot-Backend-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)
![REST API](https://img.shields.io/badge/API-REST-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

A **Banking System REST API** built using **Java, Spring Boot, and PostgreSQL** that simulates core banking operations such as customer management, account creation, and fund transfers.

This project demonstrates **backend architecture, transaction handling, and REST API development**.

---

# 🌐 Live API

Test the deployed API here:

https://banking-system-api-demo.onrender.com

Use Postman or Curl to interact with the endpoints.

```

# ✨ Features

✔ Admin and Employee roles
✔ Customer account creation
✔ Multiple account types (Savings, Salary, Loan, Current)
✔ Link customers with bank accounts
✔ Money transfer between accounts
✔ Customer KYC update
✔ Account balance check
✔ Generate account statement
✔ Annual interest calculation (3.5%)

```

# 🛠 Tech Stack

| Technology      | Usage                 |
| --------------- | --------------------- |
| Java 17         | Programming Language  |
| Spring Boot     | Backend Framework     |
| Spring Data JPA | ORM                   |
| PostgreSQL      | Database              |
| Maven           | Build Tool            |
| REST API        | Backend Communication |

---

# 📂 Project Structure

```
banking-system-api
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.bankingsystem
│   │   │        ├── controller
│   │   │        ├── service
│   │   │        ├── repository
│   │   │        ├── model
│   │   │        └── BankingSystemApplication.java
│   │   │
│   │   └── resources
│   │        └── application.properties
│
├── pom.xml
└── README.md
```

---

# 🏗 System Architecture

```
Client / Banking Application
        |
        | HTTP Request
        v
Spring Boot Controller
        |
        v
Service Layer
(Business Logic)
        |
        v
Repository Layer
(Spring Data JPA)
        |
        v
PostgreSQL Database
        |
        v
API Response
```

---

# 🔄 Banking Transaction Flow

```
Client Request
      |
      v
Controller Layer
      |
      v
Service Layer
      |
      v
Validate Transaction
      |
      v
Database Update
      |
      v
Return Response
```

---

# 🌐 API Endpoints

| Method | Endpoint        | Description          |
| ------ | --------------- | -------------------- |
| POST   | /admin/login    | Admin login          |
| POST   | /employee/login | Employee login       |
| POST   | /customers      | Create customer      |
| GET    | /customers/{id} | Get customer details |
| DELETE | /customers/{id} | Delete customer      |
| POST   | /accounts       | Create account       |
| GET    | /accounts/{id}  | Get account balance  |
| POST   | /transfer       | Transfer money       |
| PUT    | /customers/kyc  | Update KYC           |

---

# 📦 Example Request

### Create Customer

POST /customers

```json
{
 "name": "Rahul Sharma",
 "email": "rahul@example.com",
 "phone": "9876543210",
 "kycVerified": false
}
```

---

# 📦 Example Response

### Success Response

```
Customer created successfully
```

### Error Response

```
Account not found
```

---

# ▶ Run Locally

### Clone repository

```
git clone https://github.com/ChinmayaKumarSingh/Banking-System-Api.git
```

### Navigate to project

```
cd Banking-System-Api
```

### Run application

```
mvn spring-boot:run
```

---

# 🧪 Test API using Curl

### Get account balance

```
curl https://banking-system-api-demo.onrender.com/accounts/1
```

### Transfer money

```
curl -X POST https://banking-system-api-demo.onrender.com/transfer \
-H "Content-Type: application/json" \
-d '{"fromAccount":1,"toAccount":2,"amount":500}'
```

---

# 📈 Future Improvements

• JWT authentication and authorization
• Role based access control
• Docker containerization
• Swagger API documentation
• Transaction history tracking
• Email/SMS notification system

---

# 👨‍💻 Author

**Chinmaya Singh**


