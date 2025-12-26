# Book Management REST API

A beginner-friendly Book Management REST API built using Spring Boot.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2
- Maven

## Features
- Create Book
- Get All Books
- Get Book By ID
- Update Book
- Delete Book
- Validation
- Global Exception Handling

## API Endpoints
POST /books  
GET /books  
GET /books/{id}  
PUT /books/{id}  
DELETE /books/{id}

## Sample Requests (Postman)
1. Create Book
**POST** /books

Request Body:
``` json
{
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "price": 450
}
```

2. Get All Books
**GET** /books
```json
[
  {
    "id": 1,
    "title": "The Alchemist",
    "author": "Paulo Coelho",
    "price": 450
  },
  {
    "id": 2,
    "title": "Atomic Habits",
    "author": "James Clear",
    "price": 500
  }
]
```

3. Get Book By Id
**GET** /books/{id}

Example:
GET/books/1

Response:
```json
{
  "id": 1,
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "price": 450
}
```
> **Note**
> - GET requests do not require a request body.
> - Data is fetched using the URL and path variables.


4. Update Book
**PUT** /books/{id}
>Updates an existing book using its ID.

Request Body:
```json
{
  "title": "The Alchemist - Updated",
  "author": "Paulo Coelho",
  "price": 500
}
```

Response:
```json
{
  "id": 1,
  "title": "The Alchemist - Updated",
  "author": "Paulo Coelho",
  "price": 500
}
```
> Only provided fields are updated.


5. Delete Book
**DELETE** /books/{id}
Example:
DELETE /books/1

Response:
204 No Content

## How to Run
1. Clone the repository
2. Configure database in application.properties
3. Run the application
