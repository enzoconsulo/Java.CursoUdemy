package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class project {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for(int i= 1; i<=n;i++) {
			System.out.println("Product #"+ i +" Data: ");
			System.out.print("Common, used or imported (c/u/i)?");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name:");
			String name = sc.nextLine();
			
			System.out.print("Price:");
			double price = sc.nextDouble();
			sc.nextLine();
			
			
			switch(type){
			
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date data = sdf.parse(sc.next());
				sc.nextLine();
				Product pu = new UsedProduct(name,price,data);
				list.add(pu);
				break;
			
				
			case 'i':
				System.out.print("Customs fee:");
				double customsFee = sc.nextDouble();
				sc.nextLine();
				Product pi = new ImportedProduct(name,price,customsFee);
				list.add(pi);
				break;
				
				
			case 'c':
				Product pc = new Product(name,price);
				list.add(pc);
				break;
				
				
			default:
				System.out.println("Entrada Invalida. Finalizando o Programa...");
				return;
				
				
			}	
		}
		
		
		System.out.println("PRICE TAGS:");
		for(Product p : list) {
			System.out.println(p);
		}
		
		sc.close();
			
	}

}
