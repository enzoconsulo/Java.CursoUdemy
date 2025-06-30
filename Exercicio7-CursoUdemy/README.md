# Exercício 7 – Sistema de Pedidos com Módulos e Enum (Curso Udemy - Java)

## 📋 Descrição do Exercício
Este exercício implementa um sistema de pedidos que explora o uso de **módulos Java**, **orientação a objetos** e **enumerações** para gerenciar o status de um pedido.

## 🧠 O Que Foi Feito
O programa executa os seguintes passos:

1. **Coleta dados do cliente** (nome, email e data de nascimento).  
2. **Solicita o status do pedido** a partir de uma enumeração (`PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`).  
3. **Lê múltiplos itens de pedido**, cada um com quantidade e produto (nome + preço).  
4. **Calcula o total** de cada item e do pedido inteiro.  
5. **Exibe um resumo** detalhado do pedido, incluindo todos os itens e o valor total.

## 📁 Estrutura do Código
- **module-info.java**: define o módulo do projeto.  
- **entities/**  
  - `Client.java`  
  - `Order.java`  
  - `OrderItem.java`  
  - `Product.java`  
- **entities/enums/OrderStatus.java**: enumeração dos status do pedido.  
- **project/Project.java**: classe `main()` que coordena a execução.

## 🛠️ Requisitos
- **Java 11** ou superior  
- IDE (Eclipse, IntelliJ) ou terminal com JDK configurado  

## ▶️ Como Executar
1. **Compilar**:  
   ```bash
   cd Exercicio7-CursoUdemy/src
   javac -d ../bin module-info.java entities/*.java entities/enums/*.java project/Project.java
Executar:

java -p ../bin -m exercicio7.project/Project
Siga as instruções no console para fornecer os dados do cliente, status e itens.

## 📚 Conceitos Envolvidos
- ** Módulos Java (module-info.java)**

- ** Orientação a objetos (classes e relacionamentos)**

- ** Enumerações (enum)**

- ** Manipulação de listas e cálculos agregados**
