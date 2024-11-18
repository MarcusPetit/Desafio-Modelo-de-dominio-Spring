
Formação Desenvolvedor Moderno - Back-end

Módulo: Modelo de domínio e ORM
Capítulo: Modelo de domínio e ORM
Descrição do Desafio

Este projeto é parte do curso "Formação Desenvolvedor Moderno" da DevSuperior. O objetivo é criar um sistema utilizando Spring Boot com Java e banco de dados H2 para gerenciar informações de um evento acadêmico, implementando o modelo conceitual e populando a base de dados conforme especificado.
Especificação do Sistema
Sistema EVENTO

O sistema gerencia informações dos participantes das atividades de um evento acadêmico.

    Atividades do evento:
        Nome
        Descrição
        Preço
        Divisão em blocos de horários (contendo dia, horário de início e horário de término).

    Participantes:
        Nome
        E-mail

Requisitos:

    Criar o modelo de domínio com as entidades e relacionamentos necessários.
    Configurar o banco de dados H2.
    Implementar o seeding da base de dados com as informações fornecidas.
    Garantir que o projeto execute sem erros e que os dados estejam disponíveis no H2 Console.

Modelo Conceitual

A estrutura do modelo de domínio segue o diagrama abaixo:


(Adicione aqui o diagrama do modelo conceitual, se disponível.)
Tecnologias Utilizadas

    Java 17
    Spring Boot 3.x
        Spring Data JPA
        Spring Web
        H2 Database
    Maven (Gerenciador de dependências)
    Lombok (opcional, para reduzir boilerplate no código)

Como Executar o Projeto
Pré-requisitos

    Java 17 instalado
    Maven configurado

Passos para executar o projeto

    Clone o repositório:

git clone [<link-do-repositorio>](https://github.com/MarcusPetit/Desafio-Modelo-de-dominio-Spring/)
cd Desafio-Modelo-de-dominio-Spring

Compile o projeto com Maven:

mvn clean install ou pela ide

Inicie o servidor Spring Boot:

    mvn spring-boot:run

    Acesse o H2 Console no navegador:
        URL: http://localhost:8080/h2-console
        JDBC URL: jdbc:h2:mem:testdb
        Usuário: sa
        Senha: (deixe em branco)

    Confira as tabelas e os dados populados conforme o diagrama de objetos.

Estrutura do Projeto

    src/main/java:
        entities/: Classes de domínio (Participante, Atividade, Bloco).
        repositories/: Interfaces JPA para interação com o banco de dados.
        
    src/main/resources:
        application.properties: Configurações do Spring Boot e banco H2.
        data.sql: Script de seeding para popular o banco de dados.
