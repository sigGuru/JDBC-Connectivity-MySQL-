# JDBC Connectivity with MySQL using Java

This repository demonstrates how to establish a JDBC connection between a Java application and a MySQL database.

## JDBC Connectivity Steps

### 1. Import Packages

Import the required JDBC classes.

```java
import java.sql.*;
```

---

### 2. Load the Driver

Load the MySQL JDBC Driver.

```java
Class.forName("com.mysql.cj.jdbc.Driver");
```

---

### 3. Register the Driver

Create an instance of the driver and register it with `DriverManager`.

```java
Driver driver = new com.mysql.cj.jdbc.Driver();
DriverManager.registerDriver(driver);
```

> **Note:** In modern JDBC (JDBC 4.0+), explicit driver registration is optional because the driver is automatically loaded when it is present in the project's dependencies.

---

### 4. Create a Connection

Establish a connection to the MySQL database.

```java
String url = "jdbc:mysql://localhost:3306/your_database";
String username = "root";
String password = "your_password";

Connection connection = DriverManager.getConnection(url, username, password);
```

---

### 5. Create a Statement

Create a `Statement` object to execute SQL queries.

```java
Statement statement = connection.createStatement();
```

You can now execute queries such as:

```java
ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
```

or

```java
int rows = statement.executeUpdate("INSERT INTO student VALUES (1, 'Guru')");
```

---

### 6. Close Resources

Always close database resources to prevent memory leaks.

```java
statement.close();
connection.close();
```

---

## JDBC Connection Flow

```
Java Application
        │
        ▼
Load JDBC Driver
        │
        ▼
Register Driver
        │
        ▼
DriverManager
        │
        ▼
Create Connection
        │
        ▼
Create Statement
        │
        ▼
Execute SQL Queries
        │
        ▼
Close Resources
```

---

## Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA
- MySQL Connector/J

---

## Author

**Guruseelan**
