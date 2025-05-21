import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o formato de sua matriz (Formato:  numerolinhas , numerocoluna )" );
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();
		
		
		int[][] mat = new int[M][N];
		
				
		System.out.println("Lendo a matriz:");
		
		for(int i = 0; i<M ; i++) {
			
			System.out.printf("Linha %d : ",i);
			
			for(int j= 0 ; j<N ; j++) {
				mat[i][j] = sc.nextInt();
			}
				
		}
		
		System.out.print("\nNumero que deseja procurar: ");
		int search = sc.nextInt();
		
		for(int i = 0 ; i<mat.length ; i++) {
			for(int j = 0 ; j<mat[i].length ; j++) {
				
				
				if (mat[i][j] == search) {
					System.out.println("Position: " + i + "," + j);
					
					if(j-1 >= 0)
					System.out.println("Left: " + mat[i][j-1]);
					
					if(j+1 < mat[i].length )
					System.out.println("Right: " + mat[i][j+1]);
					
					if(i-1 >= 0 )
					System.out.println("Up: " + mat[i-1][j]);
					
					if(i+1 < mat.length)
					System.out.println("Down: " + mat[i+1][j]);
				}
			}
		}
	
		
		sc.close();

	}

}
