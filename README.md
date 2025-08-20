# Smart Inventory Management System

## Project Description
The Smart Inventory Management System is a modern web-based application developed to help store managers and administrators manage stock efficiently. It enables the addition, removal, and tracking of product inventory. This version currently supports inventory management for administrators. Features like customer engagement and loyalty points will be added in the future.

## Project Documents

- 📝 [Project Report (PDF)](./Inventory_Report.pdf)
- 📊 [Presentation (PPTX)](./smart_inventory_management.pptx)
- 📃 [Use Case & Deployment Certificate (PDF)](./Project_UseCase_Certificate.pdf)


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

