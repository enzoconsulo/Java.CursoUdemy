package entities;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private String email;
	private Double salary;
	
	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo (Employee o) {
		return email.compareTo(o.getEmail());
	}
	
	
	
	

}
