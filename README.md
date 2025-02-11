# PetStore RestAssured Framework

Welcome to the PetStore SRestAssured Framework repository! This framework is designed to automate testing for the PetStore API, Using RestAssured and Java, this framework provides a structured and efficient way to create, manage, and execute automated tests for the PetStore API.

## Introduction

The PetStore RestAssured Framework is built to simplify and streamline the process of testing the PetStore APIs. By automating repetitive tasks and scenarios, testers and developers can ensure the functionality and performance of the APIs.


## Setup
### Prerequisites
- Java Development Kit (JDK) 22+
- Maven
- Your choice of Java IDE (IntelliJ, Eclipse, etc.)

### Installation
1- Clone this repository to your local machine:
```bash
https://github.com/rehamkotb/GizaSystems
```
2- Import the project into your preferred Java IDE.

3- Set up the required dependencies and libraries using Maven.

## Usage
### Configuration

Before running the tests, make sure to configure the test environment settings in the config.properties file. You can specify the browser type, website URL, and other settings here.

### Writing Tests
1- Create new test classes under the src/test/java directory.

2- Implement your test cases using the Page Object Model (POM) design pattern. Interact with web elements using the provided Selenium WebDriver methods.

3- Utilize the utility functions and custom controls to enhance your test scripts' readability and maintainability.

### Running Tests

You can run the tests in your IDE or through the command line using Maven. To run tests using Maven, navigate to the project directory and execute the following command:
```bash
mvn clean test
```
Test reports will be generated in the reports directory, providing details about test successes and failures.

