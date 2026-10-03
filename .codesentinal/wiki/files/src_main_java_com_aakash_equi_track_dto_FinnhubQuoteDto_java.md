# Purpose
To serve as a Data Transfer Object (DTO) for handling stock market quote data retrieved from the Finnhub API.

# Responsibilities
Provides a structured representation of quote data, mapping external financial market information into the application's domain model.

# Architectural Role
Application Entrypoint

# Critical Review Context
The integrity of this class is vital for business logic correctness, as it defines the schema for incoming market data. Ensure all fields accurately reflect the structure expected from the Finnhub API response.

# Maintenance Notes
Updates to this file should only occur if the underlying Finnhub API contract changes. Any modification to the data structure necessitates a review of downstream services that process these quote objects.

# Known Constraints
None

# Related Components
All services and controllers responsible for communicating with the Finnhub integration layer.

# Repository Memory
This class is the foundational data contract for stock quote ingestion. Future changes should prioritize backward compatibility with the existing Finnhub integration.
