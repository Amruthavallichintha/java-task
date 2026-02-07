# Java Item Management REST API

## Description
This is a simple Java Spring Boot backend application that provides RESTful APIs
for managing a collection of items (similar to an e-commerce system).

The application uses in-memory storage and does not use any database.
Input validation is implemented using Jakarta Validation annotations.
---

## Technologies Used
- Java 17
- Spring Boot
- Maven
- REST API

---

## How to Run the Application

### Run Locally
1. Open the project in IntelliJ IDEA
2. Run the command:
   mvn clean package
3. Start the application
4. The application will run on:
   http://localhost:8081

---

## API Endpoints

### Add Item
Method: POST  
Endpoint: /api/items


**Description:**  
Adds a new item to the in-memory item list.

### Get a Single Item by ID

**Method:** GET  
**Endpoint:** /api/items/{id}

**Description:**  
Retrieves a single item from the in-memory storage using its unique ID.

**Path Parameter:**
- `id` (Long) – Unique identifier of the item

**Example Request:**
GET /api/items/1

**Example Response:**
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell laptop",
  "price": 55000
}
