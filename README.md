# api-and-test-automaion-examples

Introduction:

This guide provides step-by-step instructions for running Rest Assured and Selenium UI tests in Java with J-Unit. By following these instructions, you can easily set up and run the projects included in this repository.

Background:

This repository contains two projects: one for testing the Amazon.com UI with Selenium, and another for testing the Swagger Pet Store using Rest Assured.


Prerequisites:

To run Rest Assured and Selenium UI tests, you must have the following software installed on your machine -

- Java Development Kit (JDK) version 8 or higher. I recommend using the latest version of Java available.
- Maven build tool
- IDE of your choice (IntelliJ IDEA or Eclipse)

Setting up the Project:

Follow these steps to set up the project-

1. Clone the project from Github.
2. Open the project in your IDE.
3. Run the "mvn clean install" command to install all the dependencies.

Running the Tests:

To run the Rest Assured tests -

1. Navigate to the src/test/java directory.
2. Run all tests under postoffice.api_automation.tests.

Optionally, use the following command in your terminal: "mvn clean test". Make sure to navigate to the root directory of api-automation before running this command.


To run the Selenium UI tests:

1. Navigate to the src/test/java directory.
2. Run all tests under postoffice.amazon_ui_automation.

Optionally, use the following command in your terminal: "mvn clean test". Make sure to navigate to the root directory of amazon-ui-automation before running the command.

Note on Java Version:
It is recommended to use the latest version of Java available to ensure compatibility with the dependencies used in this project. At the time of writing this document, the latest version of Java available is JDK 19. If you are using an older version of Java, you may encounter compatibility issues.
