package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String caminho_padrao = "C:\\Users\\enzo\\eclipse-workspace\\Exercicio15\\src\\InputFile.csv" ;
		
		System.out.println("Aperte 1 para escolher o caminho padrao do arquivo ou 2 para digitar o caminho");
		
		int option = sc.nextInt();
		
		String path = new String();
		if(option == 1) {
			path = caminho_padrao;
		}else {
			System.out.println("Digite o Caminho completo do arquivo:");
			sc.nextLine();
			path = sc.nextLine();
		}
		
		List<Employee> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				String field[] = line.split(",");
				list.add(new Employee(field[0], field[1], Double.parseDouble(field[2])));
				line = br.readLine();
			}
		}
		catch(IOException e){
			System.out.println("Error : "+ e.getMessage());
		}
		
		
		System.out.print("Enter Salary: ");
		double value = sc.nextDouble();
		System.out.println("Email of people whose salary is more than "+ value+": ");
		List<String> emails = list.stream()
				.filter(x-> x.getSalary() > value)
				.map(x-> x.getEmail())
				.sorted()
				.collect(Collectors.toList());
		
		emails.forEach(System.out::println);
		
		System.out.print("Sum of salary of people whose name starts with 'M':" + 
				list.stream()
				.filter(x->x.getName().toUpperCase().charAt(0) == 'M')
				.map(x->x.getSalary())
				.reduce((x,y) -> x + y)
				.get());
		
		sc.close();
		

	}

}
