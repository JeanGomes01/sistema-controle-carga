# Sistema de Controle de Carga

![GitHub language count](https://img.shields.io/github/languages/count/JeanGomes01/SistemaCargas)
![GitHub Top Language](https://img.shields.io/github/languages/top/JeanGomes01/SistemaCargas)
![Repository size](https://img.shields.io/github/repo-size/JeanGomes01/SistemaCargas)
![GitHub last commit](https://img.shields.io/github/last-commit/JeanGomes01/SistemaCargas)
![Stargazers](https://img.shields.io/github/stars/JeanGomes01/SistemaCargas)

## 🥶 Sobre o Projeto

O **Sistema de Controle de Carga** foi desenvolvido para aplicar e reforçar conceitos de API REST com Spring Boot e Java, focando na integração com o Maven para gerenciamento de dependências.

Este sistema é uma aplicação backend que simula o controle de cargas, permitindo o gerenciamento eficiente de dados relacionados a transporte de mercadorias.

## 🚀 Tecnologias

As principais tecnologias e ferramentas utilizadas no desenvolvimento deste projeto são:

- **Java**
- **Spring Boot**
- **Maven**

## 🛠️ Guia de Instalação

Siga as etapas abaixo para instalar e configurar uma cópia local do projeto.

### Pré-requisitos

- **Java 11+**
- **Maven**
- **PostgreSQL** (ou qualquer outro banco de dados de sua escolha)

### Clonando o Repositório

1. Clone o repositório:
    ```bash
    git clone https://github.com/JeanGomes01/SistemaCargas.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd SistemaCargas
    ```

### Configurando o Banco de Dados

Certifique-se de que o PostgreSQL (ou o banco de dados que você estiver usando) está instalado e rodando em sua máquina local.

1. Crie um banco de dados no PostgreSQL:
    ```sql
    CREATE DATABASE sistemacargas;
    ```

2. Atualize as configurações de banco de dados no arquivo `application.properties` com as credenciais corretas:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/sistemacargas
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    ```

### Compilando e Executando o Projeto

1. Instale as dependências do Maven:
    ```bash
    mvn install
    ```

2. Execute o projeto:
    ```bash
    mvn spring-boot:run
    ```

O projeto estará disponível localmente em `http://localhost:8080`.

## 🛣️ Roadmap

- Implementar operações CRUD para a entidade **Carga**.
- Validar as entradas de dados com anotações do **Bean Validation**.
- Testar a aplicação com **JUnit** e **MockMVC**.

---

Este projeto faz parte do meu aprendizado contínuo em **Spring Boot** e **Maven**.
