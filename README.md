# Spring Boot Learning Project

This repository contains my practice work while learning **Spring Boot**.  
It includes examples, diagrams, and concepts covering how a Spring Boot application works — from API requests to database interactions.

---

## 📌 Overview

Spring Boot is a Java-based framework used to create production-ready applications quickly.  
This repository documents my journey in understanding:

- API Layer & HTTP Methods (GET, POST, PUT, DELETE)
- Service Layer & Business Logic
- Data Access Layer (DAO/Repository)
- Database Integration (PostgreSQL in this project)
- Class-to-Database Mapping
- Deployment Concepts (.jar files, multiple instances)

---

## 🗂 Project Structure

1. **API Layer**  
   Handles incoming client requests from frontend applications (like React or mobile apps) using REST endpoints.

2. **Service Layer**  
   Contains business logic and orchestrates interactions between the API Layer and Data Access Layer.

3. **Data Access Layer**  
   Uses JPA and PostgreSQL to interact with the database, performing CRUD operations.

4. **Database**  
   Stores application data, such as `Student` records with fields like `id`, `name`, `email`, `dob`, and `age`.

---

## 📊 Diagrams


<img width="700" height="929" alt="Screenshot 2025-08-10 101014" src="https://github.com/user-attachments/assets/af032173-f8df-48d3-b9fb-d4b3a184ecca" />

The repository includes diagrams to illustrate:

- **Layered Architecture** — How the API layer communicates with the service and data layers.
- **Entity Mapping** — How a Java class maps to a database table.
- **System Flow** — From client request to database response.
- **Deployment Flow** — Packaging as `.jar` and running across multiple instances.

---

## 🚀 How It Works

1. A client (React app or mobile app) sends a request.
2. The **API Layer** receives the request and maps it to the appropriate controller method.
3. The **Service Layer** processes the request using the required business logic.
4. The **Data Access Layer** interacts with the database to fetch, save, update, or delete data.
5. The response is sent back to the client.

---

## 🛠 Technologies Used

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **REST API**

---

## 📷 Included Images


<img width="700" height="918" alt="Screenshot 2025-08-10 165412" src="https://github.com/user-attachments/assets/fd976de4-7aa3-40a8-9633-3b6f8b558c4e" />
<img width="700" height="824" alt="Screenshot 2025-08-12 003104" src="https://github.com/user-attachments/assets/fdba00c4-4a7b-43db-8b1b-332a95082933" />

The repository contains images demonstrating:

1. Spring Boot architecture and HTTP methods.
2. Student entity mapping to the database.
3. End-to-end request flow.
4. Deployment to multiple instances.

---

## 📌 Purpose

The main goal of this repository is to:

- Strengthen my understanding of Spring Boot fundamentals.
- Document learning with both code and visuals.
- Serve as a reference for future backend development projects.

---
