# 🚀Design Patterns Project – TechVision

## 📍Descrição do Projeto
É uma simulação de aplicação Spring Boot que demonstra padrões de projeto clássicos na prática, integrando conceitos de Java Puro e Spring Framework.
O objetivo é criar uma API REST funcional de integrações internas, permitindo à equipe treinar e compreender o uso de Singleton, Strategy, Facade e Factory em um contexto real.
O projeto foi desenvolvido e testado no IntelliJ IDEA, com endpoints validados via Postman.

---
## 📚Padrões de Projeto Implementados
- Singleton: Garantia de uma única instância de configuração (ConfigSingleton).
- Strategy: Estratégias de pagamento (PaymentStrategy, CreditCardPayment, PayPalPayment).
- Facade: API REST das interações com repositórios e modelos (OrderFacade).
- Factory: Criação de estratégias dinâmicas de pagamento (PaymentFactory).
- Builder: Facilita a criação de objetos Order e Customer (opcionalmente expandido).

---
## 💻Tecnologias Utilizadas
- Java 21
- Spring Boot 3.1.1
- Spring Web
- Spring Data JPA (H2 Database para teste em memória)
- IntelliJ IDEA
- Postman (para teste de endpoints REST)

---
## ✔Testes Realizados
- Endpoints validados no Postman, incluindo casos de sucesso e falha.
- Classes de estratégia e facade testadas individualmente via main e logs de aplicação.
- Toda a aplicação testada localmente via IntelliJ IDEA.
