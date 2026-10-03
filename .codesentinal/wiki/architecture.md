# Architecture: EquiTrack

## Overview
EquiTrack is a Java-based application designed for stock tracking and management. The repository follows a standard layered architecture pattern (Controller-Service-Repository) to facilitate clean separation of concerns and maintainability.

## Major Modules

### 1. Application Core
*   **`EquiTrackApplication`**: The primary entry point for the Spring Boot application, handling bootstrapping and context initialization.
*   **`AppConfig`**: Manages global application configurations and bean definitions.

### 2. Web Layer
*   **`StockController`**: Exposes REST endpoints to interact with the application, serving as the interface for stock-related requests.

### 3. Service & Business Logic
*   **`StockService`**: Contains the core business logic for handling stock operations. It mediates between the Controller and the data persistence layer.

### 4. Data Access Layer
*   **`Stock`**: The persistence entity representing the Stock data model.
*   **`StockRepository`**: Handles database interactions and CRUD operations for the `Stock` entity.
*   **`FinnhubQuoteDto`**: A Data Transfer Object used for mapping and transporting data retrieved from external financial market integrations (Finnhub).

### 5. Error Handling
*   **`GlobalExceptionHandler`**: A centralized mechanism for handling exceptions across the application.
*   **`StockNotFoundException`**: A custom exception class used to signal when a requested stock resource does not exist.

## Data Flow
1.  **Request Entry**: Client requests arrive at the `StockController`.
2.  **Processing**: The `StockController` delegates business logic execution to the `StockService`.
3.  **Persistence**: The `StockService` interacts with the `StockRepository` to fetch or save `Stock` entities.
4.  **External Integration**: Data payloads (such as `FinnhubQuoteDto`) are utilized within the service layer to process external financial information.
5.  **Response/Exception**: Results are returned to the controller. If an error occurs, the `GlobalExceptionHandler` intercepts the exception (e.g., `StockNotFoundException`) and returns an appropriate error response.

## Review Implications
When reviewing Pull Requests (PRs), consider the following:
*   **Separation of Concerns**: Ensure business logic remains in `StockService` and is not leaked into the `StockController`.
*   **Error Handling**: Verify that new features utilize `GlobalExceptionHandler` and appropriate custom exceptions rather than generic error handling.
*   **Data Integrity**: Changes to the `Stock` entity should be evaluated for impacts on the `StockRepository` and DTO mapping logic.
*   **Test Coverage**: Ensure new code is supported by test cases within the `src/test/java` directory, specifically extending the baseline coverage provided by `EquiTrackApplicationTests`.
