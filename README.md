# Spring-Basics-Dependency-Injection--Autowiring
I have create spring application that creates an object of Employee and Autowires the Address object and Colleague list

# Spring Autowiring Basics

This project demonstrates the basic concepts of autowiring in Spring using Java-based configuration. It includes the configuration and management of beans representing different components of a typical application setup, such as `Address`, `Colleague`, and `Employee`.

## Project Overview

The project uses Spring's `@Configuration` and `@Bean` annotations to define and manage beans. Instead of using traditional XML configuration, Java configuration files are used. Dependencies are injected using Spring's `@Autowired` and `@Qualifier` annotations.

### Key Components

- **Employee Class**: Demonstrates dependency injection with `@Autowired` and `@Qualifier` annotations. It has fields for name, id, salary, address, and colleague.
- **Configuration Class**: Defines beans for `Address`, `Colleague`, and `Employee` using `@Bean` annotation.

## Features

- Demonstrates Spring's Java-based configuration.
- Showcases the use of `@Bean` annotation to define beans.
- Illustrates basic autowiring concepts in Spring.
- Uses Java configuration instead of XML configuration.
- Dependencies are downloaded from the Maven repository and included in the classpath.
- Built using Eclipse Enterprise IDE.

## Getting Started

Clone the repository and import the project into your preferred IDE. Ensure you have the necessary Spring dependencies set up.

## License

This project is licensed under the MIT License.
