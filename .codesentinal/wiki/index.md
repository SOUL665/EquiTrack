# CodeSentinal Wiki

Welcome to the CodeSentinal documentation hub. This wiki provides an overview and technical breakdown of the `equi_track` repository.

## Repository Statistics

- **Total Files:** 11
- **Source Files:** 0
- **Workflow Files:** 0
- **Config Files:** 0
- **Test Files:** 1

---

## File Documentation

### Project Overview
- [README.md](files/README_md.md) — Repository documentation and project overview.

### Application Core
- [EquiTrackApplication.java](files/src_main_java_com_aakash_equi_track_EquiTrackApplication_java.md) — Main entry point for the Spring Boot application.
- [AppConfig.java](files/src_main_java_com_aakash_equi_track_config_AppConfig_java.md) — Application configuration settings.

### Web Layer
- [StockController.java](files/src_main_java_com_aakash_equi_track_controller_StockController_java.md) — REST controller for handling stock-related requests.

### Data Layer
- [Stock.java](files/src_main_java_com_aakash_equi_track_entity_Stock_java.md) — Stock entity model.
- [StockRepository.java](files/src_main_java_com_aakash_equi_track_repository_StockRepository_java.md) — Data access layer for stock entities.
- [FinnhubQuoteDto.java](files/src_main_java_com_aakash_equi_track_dto_FinnhubQuoteDto_java.md) — Data Transfer Object for Finnhub API integration.

### Service & Business Logic
- [StockService.java](files/src_main_java_com_aakash_equi_track_service_StockService_java.md) — Business logic layer for managing stock data.

### Exception Handling
- [GlobalExceptionHandler.java](files/src_main_java_com_aakash_equi_track_exception_GlobalExceptionHandler_java.md) — Global exception handler for the API.
- [StockNotFoundException.java](files/src_main_java_com_aakash_equi_track_exception_StockNotFoundException_java.md) — Custom exception for missing stock resources.

### Testing
- [EquiTrackApplicationTests.java](files/src_test_java_com_aakash_equi_track_EquiTrackApplicationTests_java.md) — Unit and integration tests for the application.
