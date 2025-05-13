import java.util.Scanner;

import enitities.account;


public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number:");
		int accountnumber = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("\nEnter account Holder:");
		String name = sc.nextLine();
		
		
		System.out.print("\nIs there na initial deposit (y/n)?");
		char awnser = sc.next().charAt(0);
		account account1;
		
		if(awnser == 'y') {
			
			System.out.print("\nEnter initial deposit value:");
			double balance = sc.nextDouble();
			sc.nextLine();
			
			account1 = new account(accountnumber,name,balance);

		}else if(awnser == 'n') {
			
			account1 = new account(accountnumber,name);
			
		}else {
			System.out.print("\n!! Invalid Input !! \n Finishing the Program.");
			sc.close();
			return;
		}
		
		
		
		account1.getAccountData();
		
		account1.depositBalance();
		
		account1.withdrawBalance();

		
		
		
		
		
		sc.close();
		
	}

}
