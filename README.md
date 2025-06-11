# orderService

**orderService** — мікросервіс для управління замовленнями у складі масштабованої e-commerce платформи, реалізованої за принципами мікросервісної архітектури. Сервіс відповідає за створення, зберігання, оновлення та обробку замовлень, а також інтегрується з іншими компонентами через REST API.

## Основні функції

- Створення нових замовлень користувачами
- Перегляд та редагування інформації про замовлення
- Оновлення статусу замовлення (наприклад, нове, обробляється, виконано, скасовано)
- Видалення замовлень
- Взаємодія з іншими мікросервісами (userService, itemService, paymentService) через REST API
- Підтримка роботи з базою даних (MySQL)
- Документований REST API для інтеграції з фронтендом та зовнішніми сервісами

## Технології

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Spring Web**
- **Spring Validation**
- **Swagger/OpenAPI** (документація)
- **GitHub Actions** (CI/CD)

## Швидкий старт

1. **Клонувати репозиторій:**
   ```bash
   git clone https://github.com/gr-oleg/orderService.git
   cd orderService
   ```

2. **Налаштувати підключення до MySQL у `application.properties` або `application.yml`:**
   ```
   spring.datasource.url=jdbc:mysql://<host>:<port>/<db_name>
   spring.datasource.username=<username>
   spring.datasource.password=<password>
   ```

3. **Запустити застосунок:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Переглянути Swagger-документацію:**
   - http://localhost:8080/swagger-ui.html

## Основні REST-ендпоінти

- `GET /order/getAll` — отримати список усіх замовлень ([живий приклад](http://56.228.34.106/order/getAll))
- `GET /order/getById/{id}` — отримати замовлення за ідентифікатором
- `POST /order/add` — створити нове замовлення
- `PUT /order/update/{id}` — оновити інформацію про замовлення
- `DELETE /order/delete/{id}` — видалити замовлення

### Живий приклад

Сервіс розгорнутий на EC2:

- [http://56.228.34.106/order/getAll](http://56.228.34.106/order/getAll)
