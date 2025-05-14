import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Numbers of elements in vector");
		int numero_digitado = sc.nextInt();
		
		while(numero_digitado > 10 || numero_digitado < 1)
			{
				System.out.println("Only numbers between 1 and 10! ");
				numero_digitado = sc.nextInt();
				sc.nextLine();
			}
				
		
		int[] vector = new int[numero_digitado];
		
		for(int i = 0 ; i < vector.length ; i++) {
			System.out.printf("Type a number (Element %d): ", i);
			vector[i] = sc.nextInt();
			sc.nextLine();
			
		}
		
		
		System.out.println("\nNegative numbers: \n");
		
		
		for(int i = 0 ; i < vector.length ; i++) {
			
			if(vector[i] < 0 ) {
				System.out.printf("%d\n",vector[i]);
			}
			
		}
		
		
		
		sc.close();

	}

}
