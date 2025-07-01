# Exercício 10 – Tratamento de Exceções em Conta Bancária (Curso Udemy - Java)

## 📋 Descrição do Exercício
Neste exercício você implementa uma **classe de conta bancária** com **exceções personalizadas** para validar operações de saque e depósito.

## 🧠 O Que Foi Feito
O programa executa os seguintes passos:

1. **Cria uma conta** a partir de dados do usuário (número, titular e saldo inicial).  
2. **Solicita operações** de depósito ou saque.  
3. **Verifica regras** (saldo insuficiente, valores negativos) e, em caso de erro, lança `AccountException`.  
4. **Captura exceções** em blocos `try/catch` e exibe mensagens amigáveis de erro.  
5. **Exibe o saldo** final ao concluir as operações.

## 📁 Estrutura do Código
- **model/entities/Account.java**: classe que representa a conta e lança exceções.  
- **model/exceptions/AccountException.java**: exceção personalizada.  
- **main/Main.java**: método `main()` com lógica de interação.

## 🛠️ Requisitos
- **Java 11** ou superior  
- tratamento de exceções com `try/catch`  

## ▶️ Como Executar
1. **Compilar**:  
   ```bash
   cd Exercicio10-CursoUdemy/src
   javac -d ../bin model/entities/*.java model/exceptions/*.java main/Main.java
Executar:

java -cp ../bin main.Main
Siga as instruções no console para realizar depósitos e saques, observando os tratamentos de erro.

## 📚 Conceitos Envolvidos
- **Exceções personalizadas (AccountException)**

- **Blocos try/catch**

- **Encapsulamento e validação de regras de negócio**
