import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Numbers of elements in vector");
		int numero_digitado = sc.nextInt();
		sc.nextLine();
		
	
		while(numero_digitado > 10 || numero_digitado < 1)
			{
				System.out.println("Only numbers between 1 and 10! ");
				numero_digitado = sc.nextInt();
				sc.hasNextLine();
			}
				
		
		String[] vector_name = new String[numero_digitado];
		int[] vector_age = new int[numero_digitado];
		double[] vector_size = new double[numero_digitado];
		
		
		
		for(int i = 0 ; i < numero_digitado ; i++) {
			System.out.printf("Person DATA (Element %d):\n ", i);
			
			System.out.print("Name: ");
			vector_name[i] = sc.nextLine();
			
			System.out.print("Age: ");
			vector_age[i] = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Size: ");
			vector_size[i] = sc.nextDouble();
			sc.nextLine();
			
		}
		
		
		
		
		double ResultSize=0;
		int ResultAge = 0;
		int[] indexofResultAge = new int[numero_digitado];
		
		
		
		for(int i = 0 ; i < numero_digitado ; i++) {
			
			ResultSize += vector_size[i];
			
			if(vector_age[i] < 16 ) {
				
				indexofResultAge[ResultAge] = i;
				
				ResultAge++;
				
			}
			
		}
		
		
		System.out.printf("\nAverage Size: %.2f\n", ResultSize/numero_digitado);
		
		System.out.println("\nPersons with Age < 16 :" + ((double)ResultAge/numero_digitado)*100 + "%\n");
		for(int i = 0 ; i < ResultAge ; i++){
			
			System.out.println(vector_name[indexofResultAge[i]]);
		}
		
		
		
		
		sc.close();
	}

}
