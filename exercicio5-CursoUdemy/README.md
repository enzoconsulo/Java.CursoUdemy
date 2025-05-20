# Exercício 5 - Curso Udemy (Java)

## 📋 Descrição do Exercício
Neste exercício, praticamos os mesmos conceitos de orientação a objetos em Java, repetindo a criação e manipulação de uma classe `Employee`. O foco está em consolidar:
- Leitura de dados via `Scanner`
- Cálculo de salário líquido
- Aplicação de aumento percentual
- Uso de métodos e encapsulamento

## 🧠 O Que Foi Feito
1. **Leitura dos dados do funcionário**  
   - Nome  
   - Salário bruto  
   - Imposto  

2. **Cálculo do Salário Líquido**  
   - Método `netSalary()` na classe `Employee`.

3. **Aplicação de Aumento Salarial**  
   - Método `increaseSalary(percent)` atualiza `grossSalary`.

4. **Exibição dos Resultados**  
   - Antes e depois do aumento, usando `toString()`.

## 📁 Estrutura do Projeto
exercicio5-CursoUdemy/
├── src/
│ ├── main.java # Classe principal (método main)
│ └── entities/
│ └── employee.java # Classe Employee (atributos e métodos)
├── bin/ # Classes compiladas (.class)
└── .classpath, .project, # Configuração Eclipse
└── .settings/

## 🛠️ Ferramentas
- **Java 9+**
- IDE: **Eclipse** (já configurado)

## ▶️ Como Executar
1. Importe o projeto no Eclipse.  
2. Execute a classe `main.java`.  
3. Siga as instruções no console para inserir dados e ver resultados.

## 📚 Conceitos Reforçados
- **Encapsulamento**: uso de atributos privados e métodos públicos.  
- **Métodos de Instância**: cálculos internos em `Employee`.  
- **Interação com Usuário**: leitura via `Scanner`.  
- **Formatação de Saída**: sobrescrita de `toString()`.  