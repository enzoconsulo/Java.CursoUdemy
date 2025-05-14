import java.util.Scanner;

import entities.employee;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		employee empregado = new employee();
		
		System.out.print("Name: ");
		empregado.Name = sc.nextLine();

		System.out.print("Gross Salary: ");
		empregado.GrossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		empregado.Tax = sc.nextDouble();
		
		
		empregado.NetSalary();
		
		System.out.println("\nQuer aumentar em quando o salario?");
		double increase = sc.nextDouble();
		empregado.IncreaseSalary(increase);
		
		
		
		sc.close();

	}

}
