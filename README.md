# API and Test Automation Examples

## Introduction

This guide provides step-by-step instructions for running Rest Assured and Selenium UI tests in Java with J-Unit. By following these instructions, you can easily set up and run the projects included in this repository.

## Background

This repository contains two projects:

- **Amazon.com UI Tests with Selenium:** This project focuses on testing the Amazon.com user interface using Selenium.
- **Swagger Pet Store API Tests with Rest Assured:** This project demonstrates testing the Swagger Pet Store API using Rest Assured.

## Prerequisites

To run Rest Assured and Selenium UI tests, you must have the following software installed on your machine:

- Java Development Kit (JDK) version 8 or higher. We recommend using the latest version of Java available.
- Maven build tool
- IDE of your choice (IntelliJ IDEA or Eclipse)

## Setting up the Project

Follow these steps to set up the project:

1. Clone the project from GitHub.
2. Open the project in your IDE.
3. Run the `mvn clean install` command to install all the dependencies.

## Running the Tests

### Running the Rest Assured Tests

To run the Rest Assured tests:

1. Navigate to the `src/test/java` directory.
2. Run all tests under `postoffice.api_automation.tests`.
3. Optionally, use the following command in your terminal: `mvn clean test`. Make sure to navigate to the root directory of `api-automation` before running this command.

### Running the Selenium UI Tests

To run the Selenium UI tests:

1. Navigate to the `src/test/java` directory.
2. Run all tests under `postoffice.amazon_ui_automation`.
3. Optionally, use the following command in your terminal: `mvn clean test`. Make sure to navigate to the root directory of `amazon-ui-automation` before running the command.

## Note on Java Version

It is recommended to use the latest version of Java available to ensure compatibility with the dependencies used in this project. At the time of writing this document, the latest version of Java available is JDK 19. If you are using an older version of Java, you may encounter compatibility issues.

## License

This project, "api-and-test-automation-examples," is open-source and available under the [MIT License](LICENSE.MD). Feel free to use and modify the code as needed.

## Acknowledgments

We would like to acknowledge the following libraries and tools that contributed to the success of this project:

- [Rest Assured](https://rest-assured.io/): A powerful Java library for API testing.
- [Selenium](https://www.selenium.dev/): A widely-used web application testing framework.
- [JUnit](https://junit.org/): A popular testing framework for Java applications.
- [Maven](https://maven.apache.org/): A build automation tool and package manager for Java projects.

These tools and libraries have played a crucial role in enabling us to create and automate tests effectively.
