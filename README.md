# Burger Shop Backend 🍔

A robust RESTful API built with **Spring Boot** to power a modern burger shop application. This backend handles everything from menu management and user authentication to order processing and cart management.

## 🚀 Features

- **User Authentication:** Secure login and registration using Spring Security and JWT (JSON Web Tokens).
- **Menu Management:** Full CRUD operations for burger categories, items, and seasonal specials.
- **Order Processing:** Seamless order placement with status tracking (Pending, Cooking, Delivered).
- **Shopping Cart:** Manage user-specific cart items before checkout.
- **Inventory Tracking:** Basic stock management for ingredients and burger availability.
- **Role-Based Access:** Different permissions for `ADMIN` (manage menu/orders) and `CUSTOMER` (place orders).

## 🛠️ Tech Stack

- **Language:** Java 17+
- **Framework:** [Spring Boot 3.x](https://spring.io/projects/spring-boot)
- **Security:** Spring Security & JWT
- **Persistence:** Spring Data JPA (Hibernate)
- **Database:** MySQL / PostgreSQL
- **Build Tool:** Maven
- **Documentation:** Swagger / OpenAPI UI

## 📋 Prerequisites

Before running the project, ensure you have:
- JDK 17 or higher
- Maven 3.6+
- MySQL Server installed and running

## ⚙️ Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/rishinduyohan/burger-shop-spring-backend.git](https://github.com/rishinduyohan/burger-shop-spring-backend.git)
   cd burger-shop-spring-backend
