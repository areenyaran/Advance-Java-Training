# Company Application

## Overview
This folder contains the source code for an application designed for a company. The application is built following SOLID principles, which promote a more maintainable and scalable codebase. In this readme, we will provide an overview of the application, describe the classes and components, and demonstrate how SOLID principles have been applied.

### Application Purpose
The application is designed to manage a company's organizational structure, which includes directors, managers, and staff members. It also generates budget reports for directors and managers, as well as staff reports. The company can connect to a (Fake) database using a Singleton pattern and execute queries.

## Classes and Components

### iAdmin and iUser
These interfaces define methods related to administrators and users' information, such as ID, name, age, hourly rate, total hours, and more. These methods are implemented by the `Director`, `Manager`, and `Staff` classes , and created because the classes share common attributes and behavior. 

### Company
The `Company` class represents the company itself. It contains lists of directors, managers, and staff members, and it provides methods for adding and removing them.

### Director
The `Director` class implements the `iUser` and `iAdmin` interfaces and represents a director of the company, stores information about the Director, such as ID, name, age, hourly rate, and total hours. Directors have lists of managers and staff members. The class provides methods for adding and removing managers and staff, and it includes getter methods to allows access to Director's information and associated managers & staff.

### Manager
The `Manager` class implements the `iUser` and `iAdmin` interfaces and represents a manager within the company, stores information about the Manager, such as ID, name, age, hourly rate, and total hours. Managers also have list of staff members , this class includes methods for managing staff and getter methods to provides access to Manager's information and associated staff.

### Staff
The `Staff` class implements the `iUser` interface and represents staff members. It has attributes like ID, name, age, hourly rate, and total hours worked. Getter methods and a setter method for all attributes.

### DatabaseConnection 
The `DatabaseConnection` is an interface defining methods for database connection:
- connect(): Establishes a connection to the database.
- getStatus(): Checks the status of the database connection.

### Database
The `Database` class  implements the `DatabaseConnection` interface, follows the Singleton pattern and represents a database connection. It includes methods for connecting to the database and checking its status. The instance is created only once, ensuring a single point of connection.

### DBExecutor
The `DBExecutor` class is responsible for executing database queries. It takes a `DatabaseConnection` as a parameter, which allows it to interact with the database. If the database is not connected, it establishes a connection before executing queries.

### BudgetReportGenerator and BudgetCalculator
These are interfaces for generating budget reports for directors and managers, along with calculating their budgets. The `ManagerBudgetReport`, `ManagerBudgetCalculator`, `DirectorBudgetReport`, and `DirectorBudgetCalculator` classes implement these interfaces to generate budget reports and calculate budgets for managers and directors , created as a template for any possibility of creating new reports for new users to prevent any broke to open closed principle.

### StaffReportGenerator
An interface for generating staff reports, implemented by the `StaffReport` class. It generates a list of staff members and their information for directors and managers.


## Demonstration

The `Main` class demonstrates the usage of the application. It creates a company, populates it with directors, managers, and staff, and then generates budget reports and staff reports for directors and managers. It also connects to a databasea nd executes a query , and test the Singleton pattern Instances.

## SOLID Principles

The application follows SOLID principles as follows:

1. **Single Responsibility Principle (SRP):** Each class has a clear and specific responsibility. For example, the `Company` class manages company personnel, while the `DBExecutor` class is responsible for executing database queries.

2. **Open-Closed Principle (OCP):** The application is designed to be open for extension but closed for modification. New functionalities can be added without modifying existing classes, as seen in the implementation of budget reports.

3. **Liskov Substitution Principle (LSP):** The `Director`, `Manager`, and `Staff` classes implement the `iUser` and `iAdmin` interfaces, ensuring that they can be substituted for their base types ,I have avoided using any is-a relationship between classes.

4. **Interface Segregation Principle (ISP):** The interfaces `iAdmin`, `iUser`, `BudgetReportGenerator`, and `StaffReportGenerator` are defined to segregate the methods relevant to different components, allowing for more specific implementations.

5. **Dependency Inversion Principle (DIP):** The application follows dependency inversion by depending on abstractions (interfaces) rather than concrete implementations, allowing for easy changes and extensions.

SOLID principles make the application more maintainable, extensible, and testable by ensuring that each class has a single responsibility and that dependencies are abstracted, not concrete.