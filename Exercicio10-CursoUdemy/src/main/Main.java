package main;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial Balance: ");
		double initialBalance = sc.nextDouble();
		
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		System.out.print("\n\nEnter Amount for Withdraw: ");
		double withdrawRequest = sc.nextDouble();

		Account acc = new Account(number,holder,initialBalance,withdrawLimit);
		
		try{

			acc.withdraw(withdrawRequest);
			System.out.println("New balance: " + acc.getBalance());
			
		}
		catch(AccountException e){
			
			System.out.print("Withdraw error: "+ e.getMessage());
			
		}
		catch(RuntimeException e) {
			
			
			System.out.println("Unexpected Error!");
		}
		
		sc.close();
	}

		
}
