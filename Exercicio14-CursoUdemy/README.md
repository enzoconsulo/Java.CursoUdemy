# Exercício 14 – Sumário de Votos por Candidato com Map

## 📋 Descrição do Exercício
Este exercício tem como objetivo praticar o uso de **Map**, **TreeMap**, leitura de arquivos CSV e manipulação de dados em Java. O programa lê um arquivo `results.csv` que contém registros de votos por candidato e calcula o total de votos de cada um, exibindo os resultados ordenados pelo nome do candidato.

## 🧠 O Que Foi Feito
O programa executa os seguintes passos:

1. Exibe opção para usar o caminho padrão do arquivo CSV ou informar um caminho customizado.  
2. Abre o arquivo CSV (`results.csv`) usando `BufferedReader` e `FileReader` em um bloco try-with-resources.  
3. Lê cada linha, divide pelos valores (nome do candidato e número de votos) usando `String.split(",")`.  
4. Armazena e acumula o número de votos em um `TreeMap<String,Integer>`, garantindo a ordenação pelo nome do candidato.  
5. Após processar todas as linhas, chama o método `printCandidates` para exibir cada candidato e seu total de votos.

## 📁 Estrutura do Código
- src/application/Program.java  
  - Classe principal que realiza a leitura do caminho, processamento do CSV e exibição dos resultados.  
- src/results.csv  
  - Arquivo de dados contendo pares “Nome do Candidato,Quantidade de Votos”.

## 🛠️ Requisitos
- Java 8 ou superior  
- `java.io.BufferedReader` e `java.io.FileReader` para leitura de arquivos  
- Coleções Java (`Map`, `TreeMap`)  
- `Scanner` para leitura de entrada do usuário

## ▶️ Como Executar
1. Compile a classe:  
   javac -d ../bin application/Program.java  
2. Copie o arquivo `results.csv` para o diretório raiz do bin (ou informe o caminho completo quando solicitado).  
3. Execute o programa:  
   java -cp ../bin application.Program  
4. Siga as instruções para escolher o caminho do arquivo CSV. O programa exibirá os candidatos e o total de votos concatenados.

## 📚 Conceitos Envolvidos
- **Map e TreeMap** para armazenar pares chave-valor com ordenação.  
- **Try-with-resources** para gerenciamento de I/O.  
- **Leitura e processamento de CSV** usando `BufferedReader` e `String.split`.  
- **Entrada de dados** via `Scanner`.
