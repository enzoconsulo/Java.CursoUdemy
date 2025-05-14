# Exercício 2 - Curso Udemy (Java)

## 📋 Descrição do Exercício
Este exercício tem como objetivo praticar os conceitos de **orientação a objetos** em Java, por meio da criação de uma classe `Employee` (Funcionário) que realiza operações com salário.

## 🧠 O Que Foi Feito
Foi desenvolvido um programa que:
1. Lê os dados de um funcionário (nome, salário bruto e imposto).
2. Exibe o salário líquido.
3. Permite ao usuário inserir uma porcentagem de aumento salarial.
4. Atualiza e exibe novamente o salário líquido com o aumento aplicado.

## 📁 Estrutura do Projeto
- `src/entities/employee.java`: define a classe `Employee`, com:
  - Atributos: `name`, `grossSalary`, `tax`
  - Métodos:
    - `netSalary()`: calcula o salário líquido
    - `increaseSalary(percent)`: aumenta o salário em uma certa porcentagem
    - `toString()`: exibe os dados formatados
- `src/main.java`: classe principal que:
  - Coleta os dados do usuário via `Scanner`
  - Usa os métodos da classe `Employee`
  - Exibe os resultados antes e depois do aumento

## 🛠️ Tecnologias e Ferramentas
- Linguagem: **Java**
- IDE recomendada: **Eclipse**

## ▶️ Como Executar
1. Importe o projeto no Eclipse.
2. Execute a classe `main.java`.
3. Insira os dados do funcionário e o percentual de aumento quando solicitado.

## 📚 Conceitos Envolvidos
- Encapsulamento e métodos de acesso
- Manipulação de dados de entrada
- Operações matemáticas com atributos
- Interação com o usuário
