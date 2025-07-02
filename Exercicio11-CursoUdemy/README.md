# Exercício 11 – Processamento de Arquivos CSV (Curso Udemy - Java)

## 📋 Descrição do Exercício
Este exercício tem como objetivo praticar a leitura e escrita de arquivos CSV em Java, além de manipulação de listas e cálculo de valores agregados a partir de dados fornecidos em um arquivo.

## 🧠 O Que Foi Feito
O programa executa os seguintes passos:

1. **Define o caminho de leitura** do arquivo `source.csv`, contendo linhas com `nome,preço,quantidade`.  
2. **Lê o arquivo** linha a linha usando `BufferedReader`, faz o `split(",")` em cada linha e instancia objetos `Item` com `name`, `price` e `quantity`.  
3. **Armazena** todos os itens em uma `List<Item>`.  
4. **Cria um diretório** de saída chamado `Out` (se ainda não existir).  
5. **Gera o arquivo** `summary.csv` dentro de `Out`, gravando para cada item seu `name` e o `totalPrice()` (quantidade × preço).  
6. **Exibe** mensagem de sucesso no console ao final do processamento.

## 📁 Estrutura do Código
Exercicio11-CursoUdemy
├── src
│ ├── application
│ │ └── Program.java ← classe principal com main()
│ └── model
│ └── entities
│ └── Item.java ← classe que armazena nome, preço, quantidade e calcula total
└── source.csv ← arquivo de entrada (na raiz de src ou caminho especificado)


## 🛠️ Requisitos
- **Java 11** ou superior  
- Bibliotecas standard: `java.io.*`, `java.util.*`

## ▶️ Como Executar
1. **Posicione** o arquivo `source.csv` na pasta `src` (ou ajuste o caminho em `Program.java`).  
2. **Compile** as classes:
   cd Exercicio11-CursoUdemy/src
   javac -d ../bin model/entities/Item.java application/Program.java

3.Execute o programa:

java -cp ../bin application.Program
Verifique na pasta src/Out o arquivo gerado summary.csv com o nome de cada item e seu valor total.

## 📚 Conceitos Envolvidos
- **Manipulação de arquivos (File, BufferedReader, BufferedWriter)**

- **Tratamento de exceções (try-with-resources, IOException)**

- **Coleções (List<Item>)**

- **OOP: classes, atributos, métodos e sobrescrita de toString()**

- **Manipulação de strings (split) e operações aritméticas**