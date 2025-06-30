package exerciciojava3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Contribuinte> list = new ArrayList<>();
		
		for(int i = 1; i<=n ; i++) {
			System.out.println("\nTax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			switch(type) {
			
				case 'i':
					System.out.print("Health expenditures: ");
					double healthExpeditures = sc.nextDouble();
					Contribuinte ci = new PessoaFisica(name,anualIncome,healthExpeditures);
					list.add(ci);
					break;
				
				case 'c':
					System.out.print("Number of employees: ");
					int numberEmployee = sc.nextInt();
					Contribuinte cc = new PessoaJuridica(name,anualIncome,numberEmployee);
					list.add(cc);
					break;
				
				default:
					System.out.println("Invalid Input. Finishing the Program...");
					return;
			}				
		}
		
		
		System.out.println("TAXES PAID:");
		
		
		double total = 0;
		for(Contribuinte c : list) {
			System.out.println(c.toString());
			total += c.calcularImposto();
		}
		
		System.out.printf("TOTAL TAXES: %.2f",total);
		
		sc.close();
		
	}

}
