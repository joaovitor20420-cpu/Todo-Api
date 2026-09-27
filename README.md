# 📝 To-Do API

Uma API REST completa para gerenciamento de tarefas, desenvolvida em **Java 21** e **Spring Boot 3**. Este é o primeiro projeto do meu roteiro de especialização em Backend Java.

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3** (Web, Data JPA, Validation)
- **PostgreSQL** (Banco de dados relacional)
- **Docker & Docker Compose** (Infraestrutura)
- **Flyway** (Versionamento de banco de dados - Migrations)
- **Lombok** (Produtividade e redução de boilerplate)
- **Maven** (Gerenciador de dependências)

## 🏗️ Arquitetura e Padrões

O projeto foi construído seguindo boas práticas de mercado:
- Arquitetura em camadas (Controller, Service, Repository, Model)
- Padrão RESTful para os endpoints
- Tratamento global de exceções (`@ControllerAdvice`)
- Validação de dados de entrada (`@Valid`)
- Injeção de dependências (IoC)

## ⚙️ Como rodar o projeto localmente

### Pré-requisitos
- Docker e Docker Compose instalados
- Java 21+ instalado
- Maven instalado (ou use o `mvnw` incluso no projeto)

### Passos para execução

1. Clone o repositório:
```bash
git clone https://github.com/joaovitor20420-cpu/todo-api.git
```

2. Suba a infraestrutura (Banco de Dados PostgreSQL) usando o Docker:
```bash
cd todo-api
docker-compose up -d
```

3. Execute a aplicação Spring Boot:
```bash
./mvnw spring-boot:run
```
*(As tabelas do banco de dados serão criadas automaticamente pelo Flyway durante a inicialização).*

A API estará rodando em: `http://localhost:8080`

## 📚 Endpoints da API (Em Desenvolvimento)

| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/tarefas` | Lista todas as tarefas |
| `POST` | `/tarefas` | Cria uma nova tarefa |
| `GET` | `/tarefas/{id}` | Busca uma tarefa específica |
| `PUT` | `/tarefas/{id}` | Atualiza uma tarefa existente |
| `DELETE` | `/tarefas/{id}` | Remove uma tarefa |

---
*Projeto desenvolvido como parte do aprendizado prático de Arquitetura Backend com Spring Boot.*
