# Sistema de Agendamento de Horários

## 📌 Descrição

Este é um sistema de **agendamento de serviços** desenvolvido em **Java com Spring Boot**.

O projeto foi criado com o objetivo de praticar **desenvolvimento de APIs REST**, **arquitetura em camadas** e **persistência de dados com Spring Data JPA**.

A aplicação permite registrar agendamentos de clientes para determinados serviços e profissionais, controlando horários disponíveis e evitando conflitos de agendamento.

---

## 🚀 Funcionalidades

- 📅 Cadastro de agendamentos
- 📋 Consulta de agendamentos
- ✏️ Alteração de agendamentos
- ❌ Remoção de agendamentos
- ⏰ Validação de conflito de horário para o mesmo serviço

---

## 🛠 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database
- Lombok
- Postman (testes da API)

---

## 📂 Estrutura do Projeto


src
└─ main
└─ java
└─ com
└─ kingsam
└─ agendador_horarios
├─ controller
│ └─ AgendamentoController.java
│
├─ service
│ └─ AgendamentoService.java
│
└─ infrastructure
├─ entity
│ └─ AgendamentoEntity.java
│
└─ repository
└─ AgendamentoRepository.java


---

## ▶ Como executar o projeto

1. Clone o repositório:


git clone https://github.com/okingsaam/agendador-horarios.git


2. Abra o projeto no **IntelliJ IDEA**

3. Execute a classe principal:


AgendadorHorariosApplication.java


4. A aplicação iniciará em:


http://localhost:8080


---

## 🧪 Testando a API

### Criar agendamento

**POST**


/agendamentos


Body:


{
"servico": "Unhas",
"profissional": "Manicure",
"dataHoraAgendamento": "2026-03-11T11:00:00",
"cliente": "Taisa Cruz",
"telefoneCliente": "07199998855"
}


---

## 🗄 Banco de Dados

O projeto utiliza o **H2 Database em memória** para facilitar testes e desenvolvimento.

Console disponível em:


http://localhost:8080/h2-console


Configuração padrão:


JDBC URL: jdbc:h2:mem:testdb
User: sa
Password:


---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais para reforçar conceitos fundamentais de:

- Desenvolvimento de APIs REST
- Arquitetura em camadas (Controller / Service / Repository)
- Persistência de dados com JPA
- Organização de projetos backend em Java

---

## 👨‍💻 Autor

Douglas Sam  
Estudante de Análise e Desenvolvimento de Sistemas

GitHub:  
https://github.com/okingsaam
