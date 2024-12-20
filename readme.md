# Identity Management System (IDM) 

This project implements an Identity Management System (IDM) using design patterns such as Adapter and Strategy. It models various types of identities (Staff, Student, Visitor) and provides mechanisms for managing contacts and identities dynamically at runtime.

## Introduction

The Identity Management System is designed to manage different types of identities (Staff, Student, Visitor) in an organization. The system applies the Strategy design pattern to define different behaviors for each identity type and the Adapter design pattern to integrate with external services (such as a contacts management system). The core system consists of several classes, including `Identity`, `Staff`, `Student`, and `Visitor`, with associated strategies and adapters.

### Key Features:
- **Identity Types**: Models Staff, Student, and Visitor identities, each with distinct characteristics and strategies.
- **Strategy Pattern**: Different strategies are applied to handle behaviors specific to each identity type.
- **Adapter Pattern**: Adapts the IDM system to work with an external contacts service.
- **Test Integration**: The project includes basic unit tests to verify the behavior of IDM services.

## Table of Contents

1. [Installation](#installation)
2. [Usage](#usage)
3. [Features](#features)
4. [Contributing](#contributing)
5. [License](#license)
6. [Contact Information](#contact-information)
7. [Acknowledgements](#acknowledgements)

## Installation

To set up and run the IDM system, follow these steps:

1. **Clone the repository**:
    ```bash
    git clone https://github.com/rishu-8104/Identity-Management-System-IDM-more-patterns.git
    cd identity-management-system
    ```

2. **Install dependencies**:
   This project uses Maven to manage dependencies.

   - If Maven is not installed, download and install it from the [official Maven website](https://maven.apache.org/download.cgi).

3. **Build the project**:
    ```bash
    mvn clean install
    ```

4. **Run the project**:
    After building the project, you can run the application using:
    ```bash
    mvn spring-boot:run
    ```

5. **Access the application**:
    The application can be accessed at `http://localhost:8080`.

## Usage

Here’s an example of how to use the Identity Management System:

```java
public class Main {
    public static void main(String[] args) {
        // Create instances of different identity types using the strategy pattern
        Identity staffIdentity = new Staff();
        Identity studentIdentity = new Student();
        Identity visitorIdentity = new Visitor();

        // Use corresponding strategies
        staffIdentity.processIdentity();
        studentIdentity.processIdentity();
        visitorIdentity.processIdentity();
    }
}
```

### Expected Output:

```
Processing Staff Identity using Staff Strategy...
Processing Student Identity using Student Strategy...
Processing Visitor Identity using Visitor Strategy...
```

## Features

- **Identity Types**:
  - `Staff`: Represents a staff member with specific identity handling.
  - `Student`: Represents a student with unique identity management.
  - `Visitor`: Represents a visitor with its own identity processing.

- **Strategy Pattern**:
  - The `IdentityStrategy` interface defines the `processIdentity()` method. Each identity type (Staff, Student, Visitor) has its own strategy implementation (`StaffStrategy`, `StudentStrategy`, `VisitorStrategy`).

- **Adapter Pattern**:
  - The `IdmToContactsAdapter` class adapts the IDM system to work with the external contacts service. This allows seamless integration with other external systems.

- **Unit Tests**:
  - The project includes unit tests to ensure the correctness of the identity management logic. Tests are written in `IdmServiceTest.java`.

## Contributing

We welcome contributions to improve this project. If you want to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to your branch (`git push origin feature-branch`).
6. Create a pull request.

### Guidelines:
- Follow the existing code style.
- Write tests for any new features or bug fixes.
- Ensure the project builds successfully with `mvn clean install`.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact Information

For any questions or feedback, feel free to reach out:

- **Email**: rishugupta8104@gmail.com

## Acknowledgements

- **Spring Boot**: For simplifying the setup and providing an easy way to run Java applications.
- **Maven**: For managing project dependencies and building the project.
- **Design Patterns**: Implementing Strategy and Adapter design patterns for better maintainability and flexibility.
