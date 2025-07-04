# Exercício 15 – Filtragem e Soma de Salários com Lambda, Stream e CSV

## 📋 Descrição do Exercício
Este exercício tem como foco principal a prática de **expressões lambda** com a **API de Streams do Java 8**, aplicadas à leitura e manipulação de **arquivos CSV**. O objetivo é ler uma lista de funcionários, aplicar filtros e transformações funcionais nos dados, e realizar operações como ordenação, exibição e agregação usando **lambda expressions** de forma fluida e concisa.

## 🧠 O Que Foi Feito
O programa executa os seguintes passos:

1. Pergunta ao usuário se deseja usar um caminho padrão para o arquivo ou digitar um personalizado.  
2. Lê um arquivo `CSV` contendo dados de funcionários (nome, e-mail, salário).  
3. Converte cada linha do arquivo em um objeto `Employee` e armazena em uma lista.  
4. Solicita ao usuário um valor mínimo de salário.  
5. Utiliza **expressões lambda** e **Stream API** para:
   - Filtrar funcionários com salário acima do valor informado
   - Mapear e ordenar alfabeticamente os e-mails desses funcionários
   - Exibir os e-mails no console  
6. Aplica novamente expressões lambda para:
   - Filtrar funcionários cujo nome começa com a letra 'M'
   - Somar seus salários utilizando `map` e `reduce`
   - Exibir o resultado no console

## 📁 Estrutura do Código
- src/application/Program.java  
  - Classe principal que realiza entrada de dados, leitura do CSV e aplica operações com lambda e streams.  
- src/entities/Employee.java  
  - Classe `Employee` com os campos `name`, `email`, `salary` e implementação de `Comparable<Employee>` baseada em e-mail.  
- src/InputFile.csv  
  - Arquivo de entrada com os dados simulados dos funcionários.

## 🛠️ Requisitos
- Java 8 ou superior  
- `java.util.stream` e expressões lambda  
- `BufferedReader`, `FileReader` e `Scanner` para leitura de entrada  
- Formato de entrada CSV

## ▶️ Como Executar
1. Compile as classes:  
   javac -d ../bin application/Program.java entities/Employee.java  
2. Garanta que o arquivo `InputFile.csv` esteja no caminho padrão ou informe o caminho completo ao executar.  
3. Execute o programa:  
   java -cp ../bin application.Program  
4. Digite o valor mínimo de salário.  
5. O programa exibirá:
   - Os e-mails (ordenados) dos funcionários que ganham acima do valor informado
   - A soma dos salários de todos os funcionários com nome iniciado por 'M'

## 📚 Conceitos Envolvidos
- **Expressões Lambda**: simplificação de código para filtragem, mapeamento e redução de dados  
- **Stream API**: operações funcionais sobre listas com encadeamento de chamadas  
- **filter**, **map**, **sorted**, **collect**, **reduce**  
- **Encapsulamento** com a classe `Employee`  
- **Leitura de arquivos CSV** com `BufferedReader`
