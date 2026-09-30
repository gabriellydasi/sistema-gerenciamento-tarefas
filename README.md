# Sistema de Gerenciamento de Tarefas

API REST desenvolvida em Java com Spring Boot para gerenciamento de tarefas.

O projeto foi desenvolvido como parte da atividade prática de Gerência de Configuração, da disciplina de Fundamentos da Engenharia de Software da instituição UFRPE.

## Funcionalidades

A API permite realizar operações de gerenciamento de tarefas:
- Cadastro de tarefas;
- Consulta de tarefas;
- Atualização de tarefas;
- Exclusão de tarefas.

As tarefas possuem informações como nome, descrição, prioridade e status de conclusão, as quais são utilizadas no gerenciamento e na organização dos registros.

## Estrutura
O projeto utiliza uma arquitetura em camadas, separando as responsabilidades da aplicação:
```
src/
└── main/
    ├── java/
    │   └── br/
    │       └── com/
    │           └── gabriellysilva/
    │               └── tarefas/
    │                   ├── controller/
    │                   ├── entity/
    │                   ├── repository/
    │                   └── service/
    │
    └── resources/
        └── application.properties
```

## Objetivo acadêmico

Este projeto tem como objetivo aplicar, na prática, conceitos relacionados à Gerência de Configuração de Software, incluindo:

- Controle de versões;
- Registro de alterações;
- Organização do histórico de desenvolvimento;
- Criação de versões identificáveis por tags;
- Simulação e documentação de mudanças;
- Rastreabilidade das alterações realizadas no projeto.

## Integrante 
- Gabrielly da Silva Oliveira - Polo Gravatá/PE

<hr>
<i>Projeto desenvolvido para fins acadêmicos - UFRPE</i>