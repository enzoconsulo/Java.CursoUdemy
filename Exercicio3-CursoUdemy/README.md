# Exercício 3 - Curso Udemy (Java)

## 📋 Descrição do Exercício
Este exercício tem como objetivo praticar os conceitos de **orientação a objetos** em Java, por meio da criação de uma classe `account` (Conta Bancária), que permite operações de depósito, saque e exibição de dados da conta.

## 🧠 O Que Foi Feito
Foi desenvolvido um programa que:
1. Lê os dados de uma conta bancária (número, titular e depósito inicial opcional).
2. Exibe os dados da conta.
3. Permite ao usuário realizar um depósito.
4. Permite ao usuário realizar um saque.
5. Exibe os dados atualizados após cada operação.

## 📁 Estrutura do Projeto
- `src/enitities/account.java`: define a classe `account`, com:
  - Atributos: `Accountnumber`, `Name`, `Balance`
  - Métodos:
    - `getAccountData()`: exibe os dados da conta
    - `depositBalance()`: permite realizar um depósito
    - `withdrawBalance()`: permite realizar um saque
- `src/main.java`: classe principal que:
  - Coleta os dados do usuário via `Scanner`
  - Instancia a classe `account`
  - Chama os métodos para exibir e atualizar os dados da conta

## 🛠️ Tecnologias e Ferramentas
- Linguagem: **Java**
- IDE recomendada: **Eclipse**

## ▶️ Como Executar
1. Importe o projeto no Eclipse.
2. Execute a classe `main.java`.
3. Insira os dados da conta e as operações bancárias quando solicitado.

## 📚 Conceitos Envolvidos
- Programação orientada a objetos (POO)
- Construtores sobrecarregados
- Métodos com entrada de dados do usuário
- Encapsulamento de atributos e uso de getters/setters
- Manipulação de entrada com `Scanner`
