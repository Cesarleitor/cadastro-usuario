# Cadastro de Usuário

Sistema de cadastro de usuários desenvolvido em **Java com Spring Boot**, utilizando **API REST** para operações de cadastro, busca, atualização e exclusão de dados. O projeto integra **H2 Database**, **Spring Data JPA** e uma organização em camadas, servindo como prática de backend e persistência de dados. :contentReference[oaicite:0]{index=0}

## Funcionalidades

- Cadastrar usuário
- Buscar usuário por e-mail
- Atualizar usuário por ID
- Deletar usuário por e-mail
- Persistir dados com JPA
- Testar endpoints com Postman
- Visualizar banco em memória com H2 Console

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Lombok

## Estrutura do projeto

O projeto está organizado em camadas para facilitar a manutenção e o entendimento do código, incluindo controller, service, entity e repository. O repositório contém a estrutura padrão de um projeto Maven com `src`, `pom.xml` e Maven Wrapper. :contentReference[oaicite:1]{index=1}

## Endpoints da API

### Criar usuário
**POST** `/usuario`

Exemplo de body:
```json
{
  "email": "teste@teste.com",
  "nome": "Teste"
}
