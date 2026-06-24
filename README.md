# ms-cliente · Microsserviço de Clientes

Microsserviço desenvolvido como projeto acadêmico no curso de **Desenvolvimento Back-end Java** da EBAC, simulando um ecossistema distribuído com o [ms-produto](https://github.com/bdlc95/msproduto).

## Sobre o projeto

Serviço responsável pelo gerenciamento de clientes dentro de uma arquitetura de microsserviços. Cada serviço possui seu próprio banco de dados PostgreSQL, garantindo a descentralização e independência entre os domínios.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Web (REST)
- OpenFeign (comunicação entre serviços)
- PostgreSQL
- Maven

## Funcionalidades

- CRUD completo de clientes via endpoints RESTful
- Comunicação síncrona com o ms-produto via OpenFeign
- Validação customizada de dados de entrada
- Tratamento global de exceções com `@ControllerAdvice`
- Desacoplamento de entidades com padrão DTO

## Arquitetura
