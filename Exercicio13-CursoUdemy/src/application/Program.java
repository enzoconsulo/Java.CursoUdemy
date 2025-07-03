
// conceitos gerais e conjuntos na ED Set 

package application;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numberOfCourses = 3;
		List<Course> courses = new ArrayList<>(); 
		Set<Integer> totalStudents = new LinkedHashSet<>();
		
		for(int i = 0; i<numberOfCourses;i++) {

			courses.add(new Course(i));
		}
		
		for(Course c : courses) {
			
			System.out.print("How many students for course "+ (char)('A' + c.getIdCourse()) +"? ");
			int numberOfStudents = sc.nextInt();
			for(int i = 1;i<=numberOfStudents;i++) {
				c.addAlunos(sc.nextInt());
			}
			
			totalStudents.addAll(c.getAlunos());
		}
		
		courses = null;
		
		System.out.println("Total Students: "+ totalStudents.size());
		// System.out.println(totalStudents.toString());;
	
		sc.close();
	}

}
