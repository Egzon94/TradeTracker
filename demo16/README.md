# Trading Tracker Application

The Trading Tracker Application is a backend application built using Java.


## Description of the Project
The Trading Journal Application is a backend application built using Java and Spring Boot. It allows users to track their trades in a journal, organizing them by portfolios and managing each trade with attributes such as ticker, price, quantity, and more. The project follows REST API best practices, implementing all CRUD actions for traders, portfolios, and trades (including stock and forex trades).

## Class Diagram
                   +--------------------+
                   |      Trader        |
                   +--------------------+
                   |  id : Long         |
                   |  name : String     |
                   |  email : String    |
                   +--------------------+
                             |
                             | 1..*
                             |
                   +--------------------+
                   |    Portfolio       |
                   +--------------------+
                   |  id : Long         |
                   |  name : String     |
                   +--------------------+
                             |
                             | 1..*
                             |
                   +--------------------+
                   |      Trade         |
                   +--------------------+
                   |  id : Long         |
                   |  ticker : String   |
                   |  quantity : int    |
                   |  price : double    |
                   |  date : LocalDate  |
                   +--------------------+
                        /          \
                       /            \
                      /              \
      +--------------------+     +--------------------+
      |   StockTrade       |     |   ForexTrade       |
      +--------------------+     +--------------------+
      |  exchange : String |     |  currencyPair : String |
      +--------------------+     |  leverage : double  |
                                 +--------------------+




## Setup


Java 11 

Maven

MySQL

IntelliJ

## Technologies Used

Java 11 - Language used for development

Spring Boot - Framework for building the backend AP
I
Spring Data JPA - For ORM and database handling

MySQL - Relational database

Maven - Dependency management and build automation too

# Controllers and Routes Structure

##  TraderController
GET /api/traders - Get all traders

POST /api/traders - Add a new trader

DELETE /api/traders/{id} - Delete a trader by ID

## PortofolioController
GET /api/portfolios - Get all portfolios

POST /api/portfolios - Add a new portfolio

DELETE /api/portfolios/{id} - Delete a portfolio by ID

## TradeController
GET /api/trades - Get all trades

POST /api/trades - Add a new trade (stock or forex)

DELETE /api/trades/{id} - Delete a trade by ID

# Future Work

Add more trading types such as options and crypto.

Enhance security with JWT authentication and role-based access control.

Implement a comprehensive logging system for tracking user actions and trade history.

Add user interface with Angular or React.

# Resources
https://spring.io/projects/spring-boot

https://dev.mysql.com/doc/