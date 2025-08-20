# Inventra - Smart Inventory Management System

## Project Description
Inventra is an intelligent inventory management system designed to simplify stock tracking, optimize warehouse operations, and boost customer engagement. It combines real-time inventory monitoring with data-driven insights, helping businesses avoid shortages, reduce wastage, and improve efficiency.

For business owners, Inventra provides automated low-stock alerts, supplier management, and sales analytics to make smarter decisions

## Technologies Used
- Backend: Spring Boot
- Frontend: React.js
- Database: MySQL
- Authentication: JWT
- Tools: Visual Studio Code, IntelliJ IDEA, Postman

## How to Run the Project

### Prerequisites
- Node.js and npm
- Java JDK 17+
- MySQL server running
- Maven


### Steps to Run/Execute the Project
## Prerequisites
 -Before running the project, make sure you have the following installed:
 -Java JDK 17 or above
 -Node.js and npm
 -MySQL Server
 -Maven
 -Git

### Step 1 Clone the Repository
git clone https://github.com/your-username/Riyas_CSE2_SmartInventorySystem.git
cd Riyas_CSE2_SmartInventorySystem

### Step 2 Set Up the Backend
cd backend
   ## Open src/main/resources/application.properties

 ## Update the database username, password, and schema name
  -spring.datasource.username=your_mysql_username
  -spring.datasource.password=your_mysql_password
  -spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name

### Step 3 Run the backend
  - mvn spring-boot:run

### Step 4 Set Up the Frontend
  - cd ../frontend

### Step 5 Install dependencies
  - npm install

### Step 6 Start the frontend server
  - npm start

 ## Frontend will run at http://localhost:5173

### Step 7  Access the Application
  - Open your browser and go to:
  - http://localhost:5173

