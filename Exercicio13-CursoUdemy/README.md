# Exercício 13 – Contagem de Alunos por Curso com Set (ED Set)

## 📋 Descrição do Exercício
Este exercício tem como objetivo praticar o uso de **coleções do tipo Set** em Java para gerenciar registros de alunos de forma que não haja duplicatas. O programa lê dados de matrícula de alunos em três cursos (A, B e C) e calcula o total de alunos únicos considerando sobreposição entre cursos.

## 🧠 O Que Foi Feito
O programa executa os seguintes passos:

1. Pergunta quantos alunos há em cada curso (A, B e C).  
2. Lê os IDs de matrícula (inteiros) para cada curso, usando Scanner.  
3. Armazena cada matrícula em um LinkedHashSet<Integer> dentro de uma instância da classe Course, garantindo que não haja entradas duplicadas.  
4. Une os três conjuntos de alunos em um único Set para obter todos os alunos únicos.  
5. Exibe no console o total de alunos únicos.

## 📁 Estrutura do Código
- src/application/Program.java  
  - Classe principal que faz interação via console e orquestra a leitura de dados e contagem.  
- src/entities/Course.java  
  - Classe que encapsula um LinkedHashSet<Integer> para armazenar as matrículas e fornece métodos para adicionar alunos e recuperar o conjunto.

## 🛠️ Requisitos
- Java 8 ou superior  
- java.util.Scanner para entrada de dados  
- Coleções Java (java.util.Set, java.util.LinkedHashSet)

## ▶️ Como Executar
1. Abra o terminal no diretório raíz do exercício:
   cd Exercicio13/src
2. Compile as classes:
   javac -d ../bin application/Program.java entities/Course.java
3. Execute o programa:
   java -cp ../bin application.Program
4. Siga as instruções no console para informar a quantidade de alunos e os respectivos IDs de matrícula para os cursos A, B e C. O programa exibirá ao final o total de alunos únicos.

## 📚 Conceitos Envolvidos
- **Coleções (Set e LinkedHashSet) para evitar duplicação de elementos.**
- **Conceitos de União através do Set.** 
- **Encapsulamento na classe Course, isolando a lógica de armazenamento.** 
