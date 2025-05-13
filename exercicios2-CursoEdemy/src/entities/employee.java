package entities;

public class employee {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public void NetSalary() {
		System.out.printf("%s , $ %.2f ", this.Name , GrossSalary-Tax);
		return;
	}
	
	public void IncreaseSalary(double increase) {
		this.GrossSalary = GrossSalary*((100+increase)/100);
		NetSalary();
		return;
	}
	
}
