import java.util.Scanner;
import entities.rectangle;

public class main {

	public static void main(String[] args) {
		System.out.println("Enter retangle width and height");
		rectangle retangulo = new rectangle();
		
		Scanner sc = new Scanner(System.in);
		
		retangulo.weight = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		
		System.out.printf("AREA: %.2f \n PERIMETER: %.2f \n DIAGONAL: %.2f ", retangulo.area(),retangulo.perimeter(),retangulo.diagonal());
		
		
		sc.close();

	}

}
