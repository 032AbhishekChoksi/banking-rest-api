# Simple Banking Application REST APIs

This project aims to build REST APIs for a simple Banking application using Spring Boot, Spring Data JPA (Hibernate), and MySQL database. The APIs will provide functionality for basic banking operations such as creating accounts, transferring funds, checking balances, and retrieving transaction history.

## Features

- **Account Management**: Create, update, and delete bank accounts.
- **Transaction Handling**: Perform transactions such as deposit, withdrawal, and fund transfers between accounts.
- **Balance Inquiry**: Retrieve account balance information.
- **Transaction History**: View transaction history for an account.
- **Security**: Implement authentication and authorization mechanisms to ensure secure access to the APIs.
- **Validation**: Validate input data to ensure data integrity and consistency.
- **Error Handling**: Properly handle errors and exceptions to provide meaningful feedback to API consumers.
- **Logging**: Implement logging to track API usage and debug issues.

## Technologies Used

- **Spring Boot**: Framework for building robust and scalable Java applications.
- **Spring Data JPA (Hibernate)**: Simplifies database operations by providing an easy-to-use interface for working with relational databases.
- **MySQL Database**: RDBMS for storing banking data.
- **Spring Security**: Provides authentication and authorization support.
- **Swagger UI**: Generate interactive API documentation for easy testing and exploration.
- **JUnit & Mockito**: Frameworks for unit testing and mocking dependencies.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed (version 8 or higher)
- Maven installed
- MySQL Server installed and running

### Installation

1. Clone the repository:

```bash
git clone https://github.com/032AbhishekChoksi/banking-rest-api
```

2. Navigate to the project directory:

```bash
cd banking-rest-api
```

3. Update MySQL database configuration in `application.properties`:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/banking_app
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
```

4. Build the project:

```bash
mvn clean install
```

5. Run the application:

```bash
java -jar target/banking-rest-api.jar
```

## API Documentation

Once the application is running, you can access the API documentation using Swagger UI at `http://localhost:8080/swagger-ui.html`.

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for any bugs or feature requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This project is inspired by the need for a simple, yet functional banking application for educational and demonstration purposes.
- Special thanks to the Spring Boot, Spring Data JPA, and MySQL communities for providing excellent documentation and resources.
