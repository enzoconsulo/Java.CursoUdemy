# Exercício 12 – Processamento de Contrato com Parcelas (Curso Udemy - Java)

## 📋 Descrição do Exercício
Este exercício tem como objetivo praticar o uso de **interfaces**, **listas**, manipulação de **datas** com `java.time` e o **padrão Strategy** para cálculo de parcelas de um contrato.

## 🧠 O Que Foi Feito
O programa executa os seguintes passos:

1. **Recebe os dados do contrato**: número, data (dd/MM/yyyy) e valor total.  
2. **Lê o número de parcelas** desejadas.  
3. **Instancia** um objeto `Contract`, passando também uma implementação de `PaymentMethod` (no caso, `PMethodPaypal`).  
4. **Calcula as parcelas**: para cada mês, aplica a taxa de serviço mensal e a taxa de pagamento, compondo o valor da parcela.  
5. **Gera uma lista** de objetos `Installment`, cada um com data de vencimento (contrato + i meses) e valor calculado.  
6. **Exibe** no console todas as parcelas com data formatada e valor correspondente.

## 📁 Estrutura do Código
- **src/Application/Application.java**  
  - Classe `main()` que faz interação via console.  
- **src/model/entities/Contract.java**  
  - Contém dados do contrato e lógica para gerar parcelas.  
- **src/model/entities/Installment.java**  
  - Representa cada parcela com data e valor.  
- **src/model/entities/PaymentMethod.java**  
  - Interface que define métodos de taxa de pagamento e taxa mensal.  
- **src/model/entities/PMethodPaypal.java**  
  - Implementação de `PaymentMethod` com regras para PayPal.

## 🛠️ Requisitos
- **Java 11** ou superior  
- `java.util.Scanner` para entrada de dados  
- `java.time` (LocalDate, DateTimeFormatter)  

## ▶️ Como Executar
1. **Abra o terminal** no diretório do exercício:  
   ```bash
   cd Exercicio12-CursoUdemy/src
Compile todas as classes:

javac -d ../bin Application/Application.java model/entities/*.java
Execute o programa:

java -cp ../bin Application.Application
Siga as instruções no console para informar número, data do contrato, valor total e quantidade de parcelas. O programa exibirá a lista de parcelas com datas e valores.

##📚 Conceitos Envolvidos
- **Interfaces e polimorfismo (PaymentMethod, PMethodPaypal)**

- **Coleções (List<Installment>)**

- **Manipulação de datas (LocalDate, DateTimeFormatter)**

- **Padrão Strategy para cálculo de taxas**

