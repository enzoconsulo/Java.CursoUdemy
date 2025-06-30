# Exercício 9 – Herança e Cálculo de Impostos (Curso Udemy - Java)

## 📋 Descrição do Exercício
Este exercício desenvolve um programa para calcular impostos de contribuintes, utilizando **classes abstratas**, **herança** e **listas de objetos**.

## 🧠 O Que Foi Feito
O programa executa os seguintes passos:

1. **Lê o número de contribuintes** a serem processados.  
2. Para cada um, coleta **tipo** (`Física` ou `Jurídica`) e dados específicos:  
   - Pessoa Física: nome, renda anual e gastos com saúde.  
   - Jurídica: nome, renda anual e número de funcionários.  
3. **Instancia** objetos de `PessoaFisica` ou `PessoaJuridica`, ambas estendendo a classe abstrata `Contribuinte`.  
4. **Calcula o imposto** devido de cada contribuinte e o total geral.  
5. **Exibe** valores individuais e somatório no console.

## 📁 Estrutura do Código
- **module-info.java**  
- **entities/**  
  - `Contribuinte.java` (abstrata)  
  - `PessoaFisica.java`  
  - `PessoaJuridica.java`  
- **exerciciojava3/Main.java**: classe com método `main()`.

## 🛠️ Requisitos
- **Java 11** ou superior  
- `java.util.Scanner`  

## ▶️ Como Executar
1. **Compilar**:  
   ```bash
   cd Exercicio9-CursoUdemy/src
   javac -d ../bin module-info.java entities/*.java exerciciojava3/Main.java
Executar:

java -p ../bin -m exercicio9.exerciciojava3/Main
Preencha no console os dados de cada contribuinte conforme solicitado.

📚 Conceitos Envolvidos
Classes abstratas e herança

Listas de objetos (List<Contribuinte>)

Laços de repetição e condicionais

Cálculos financeiros básicos