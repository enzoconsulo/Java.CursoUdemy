package entities;

public class employee {
	
	int id;
	String name;
	double salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void salaryIncrease(double percentage) {
		
		salary = salary * (1+(percentage/100));
		
	}
	
}
