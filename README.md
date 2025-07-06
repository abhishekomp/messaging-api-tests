# Notification Service BDD Tests

This project contains BDD (Behavior-Driven Development) tests for the Notification Service using Cucumber, Spring, and JUnit.

## Project Structure

- `src/test/java/org/example/stepdefs/` — Step definitions for Cucumber scenarios
- `src/test/resources/org/example/` — Feature files describing test scenarios
- `src/main/java/org/aom/` — Application source code (e.g., `NotificationService`)
- `SpringContextHolder` — Manages the Spring application context for tests

## Prerequisites

- Java 17 or higher
- Maven 3.8+
- (Optional) IntelliJ IDEA 2025.1.3

## Running Tests

To execute all Cucumber tests, run:

```sh
mvn clean test
```

## Key Features

- **Cucumber** for BDD-style test scenarios
- **Spring** for dependency injection in step definitions
- **AssertJ** for fluent assertions

## Adding Feature Files

Place new `.feature` files in `src/test/resources/org/example/`.

## Troubleshooting

- Ensure your step definition classes and hooks are in the correct glue package (e.g., `org.example.stepdefs`).
- If you see "Cannot resolve method 'assertThat'", ensure AssertJ is included as a test dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.25.3</version>
    <scope>test</scope>
</dependency>
```

## License

MIT License