package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class project {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("   Enter cliente data:\n");
		
		System.out.print("Name:");
		String clientName = sc.nextLine();
		
		System.out.print("Email:");
		String clientEmail = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY):");
		Date clientBirthDate = sdf.parse(sc.next());
		sc.nextLine();
		
		Client c = new Client(clientName, clientEmail, clientBirthDate);
		
		
		
		System.out.println("   Enter order data:\n");
		
		System.out.print("Status:");  
		String aux = sc.nextLine();
		
		System.out.println("How many items to this order?");
		int orderQuantity = sc.nextInt();
		
		
		Order order = new Order( OrderStatus.valueOf(aux), c);
		
		
		for(int i=0;i<orderQuantity;i++) {
			
			System.out.println("Enter #" + (i+1) +" item data:");
			
			System.out.print("Product name:");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product price:");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity:");
			int orderItemQuantity = sc.nextInt();
			
			
			Product p = new Product(productName, productPrice);
			
			OrderItem OI = new OrderItem(orderItemQuantity,p);
			
			order.addItem(OI);
		}
		
		System.out.println(order);
		
		sc.close();
	}

}
