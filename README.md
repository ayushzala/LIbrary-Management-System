

# Library Management System

This project is a basic Library Management System developed in Java, designed to manage a library's book collection with the following features:

- **Add Books:** Add new books to the library with essential details such as ISBN, title, author, and publication year.
- **Borrow Books:** Borrow available books, with the system updating its records to reflect the change.
- **Return Books:** Return borrowed books, making them available again for other users.
- **View Available Books:** Display a list of all books currently available in the library.

The project is built using Test-Driven Development (TDD) to ensure high-quality code and thorough test coverage.

## Setup Instructions

### Prerequisites

Before starting, make sure you have the following installed:

- **Visual Studio Code**
- **Extension Pack for Java:** Install the necessary plugins.
- **Git:** For version control.

### Project Setup

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd Library_Management_System
   ```

2. Open the project in VSCode:
   - Launch Visual Studio Code.
   - Open the project folder (`Library_Management_System`) you just cloned.

### Running Tests

#### Running Unit Tests in VSCode

1. Enable Java Tests:
   - Navigate to the Testing tab in the sidebar.
   - Enable Java tests and ensure `JUnit Jupiter` is configured.

2. Execute the Tests:
   - You can find "Run Test" or "Debug Test" options above each test method. Click on "Run Test" to execute the test.

## Design Decisions

### Project Structure

- **`src/main/java/`:** Contains the main application code.
  - `Library.java:` Implements the Library class.
  - `Book.java:` Implements the Book class.
- **`src/test/java/`:** Contains the test cases.
  - `LibraryTest.java:` Includes unit tests for the Library functionality.
- **`README.md:`** Documentation for the project.

### Development Approach

- **Test-Driven Development (TDD):** Each feature was implemented by writing tests first, ensuring comprehensive coverage and functionality.
- **SOLID Principles:** The code adheres to SOLID principles, making it easier to maintain, extend, and refactor.
- **Modular Structure:** The system is organized into distinct classes (Library, Book), promoting a clear separation of concerns and enhancing readability.
