# 📈 EquiTrack - Stock Portfolio Management API

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

## 📌 Project Overview
EquiTrack is a robust, production-ready RESTful backend API designed to manage and track user stock portfolios. It integrates with external financial markets to fetch real-time stock data and persists user portfolios using a relational database. 

This project was built to demonstrate core backend engineering principles, including RESTful API design, third-party API integration, database modeling, and global exception handling.

## 🚀 Core Features
* **Real-Time Market Integration:** Communicates with the Finnhub Financial API to fetch live stock quotes, including current price, daily highs/lows, and opening/closing prices.
* **Persistent Data Storage:** Utilizes Spring Data JPA and Hibernate to map Java objects to a MySQL database, ensuring data persistence across server lifecycles.
* **Resilient Architecture:** Implements global custom exception handling (e.g., `StockNotFoundException`) to intercept application errors and return standardized, user-friendly HTTP responses.
* **CRUD Operations:** Fully functional endpoints to add, retrieve, and manage portfolio entities.

## 🛠️ Technical Stack
| Component | Technology |
| :--- | :--- |
| **Backend Framework** | Java, Spring Boot |
| **Database** | MySQL |
| **ORM / Data Access** | Spring Data JPA, Hibernate |
| **External API** | Finnhub Stock API |
| **Build Tool** | Maven |
| **API Testing** | Postman |

## ⚙️ Local Setup & Installation

To run this project locally for evaluation or development, follow these steps:

**1. Clone the repository**
```bash
git clone [https://github.com/SOUL665/equitrack-backend.git](https://github.com/SOUL665/equitrack-backend.git)
cd equitrack-backend

**Author:** Aakash Yadav
**GitHub Profile:** [@SOUL665](https://github.com/SOUL665)  
**Repository Link:** [EquiTrack on GitHub](https://github.com/SOUL665/EquiTrack)
