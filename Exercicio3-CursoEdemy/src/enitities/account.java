package enitities;

import java.util.Scanner;

public class account {
	
	private int Accountnumber;
	private String Name;
	private double Balance;
	
	
	public account(int accountnumber, String name, double balance) {
		this.Accountnumber = accountnumber;
		this.Name = name;
		this.Balance = balance;
	}

	
	public account(int accountnumber, String name) {
		this.Accountnumber = accountnumber;
		this.Name = name;
	}


	public int getAccountnumber() {
		return Accountnumber;
	}
	
	
	public String getName() {
		return Name;
	}

	public double getBalance() {
		return Balance;
	}
	
	public void setAccountnumber(int accountnumber) {
		this.Accountnumber = accountnumber;
	}

	public void setName(String name) {
		this.Name = name;
	}
	
	public void getAccountData(){
		
		int accountnumberF = getAccountnumber();
		String nameF = getName();
		double balanceF = getBalance();
		
		
		System.out.println(
		"Account data:\n Account: " + accountnumberF 
		+ ", Holder: " + nameF 
		+ ", Balance: $" + balanceF
		+ "\n");
		
	}
	
	
	public void depositBalance() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a deposit value:");
		double quantity = sc.nextDouble();
		sc.nextLine();
		this.Balance += quantity;
		
		System.out.print("Updated ");
		getAccountData();
	}
	
	public void withdrawBalance() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a withdraw value:");
		double quantity = sc.nextDouble();
		sc.nextLine();
		this.Balance -= quantity;
		
		System.out.print("Updated ");
		getAccountData();
	}
	
	
	
	
	
	
	
	
	
	
}
