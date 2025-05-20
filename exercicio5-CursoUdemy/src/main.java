import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en","US"));
		
		int n = 0;
		
		System.out.println("How many employees will be registered?");
		n = sc.nextInt();
		sc.nextLine();
		
		
		List<employee> list = new ArrayList<>(n);

		for(int i=0; i<n ;i++) {
			
			list.add(new employee());
			
			System.out.printf("\n Employee %d: \n", i);
			
			System.out.print("   Id:");
			list.get(i).setId(sc.nextInt());
			sc.nextLine();
			
			System.out.print("   Name:");
			list.get(i).setName(sc.nextLine());
			
			System.out.print("   Salary:");
			list.get(i).setSalary(sc.nextDouble());
			sc.nextLine();
		}
		
		
		
		System.out.print("\n\nEnter the employee id that will have salary increase :");
		int verify_id = sc.nextInt();
		sc.nextLine();
		
		employee result = list.stream()
				.filter(x -> x.getId() == verify_id)
				.findFirst()
				.orElse(null);
		
		
		if (result == null) {
			System.out.println("This id does not exist!\n");
		}else {
			System.out.println("Enter the percentage (0 a 100) :");
			result.salaryIncrease(sc.nextDouble());
			sc.nextLine();
		}
		
		
		System.out.println("List Of Employees:");
		
		for (employee i : list)
		{
			System.out.printf("\nId: %d , Name: %s , Salary: %.2f", i.getId(),i.getName(), i.getSalary());
			
		}
		
		sc.close();

	}

}
