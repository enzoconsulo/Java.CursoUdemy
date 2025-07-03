package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Program {
	
	
	
	public static void main(String[] args){
		
		String caminho_padrao = "C:\\Users\\enzo\\eclipse-workspace\\Exercicio14\\src\\results.csv" ;
		Map<String, Integer> candidates = new TreeMap<String, Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Aperte 1 para escolher o caminho padrao do arquivo ou 2 para digitar o caminho");
		
		int option = sc.nextInt();
		
		String path = new String();
		if(option == 1) {
			path = caminho_padrao;
			
		}else {
			System.out.println("Digite o Caminho completo do arquivo:");
			sc.nextLine();
			path = sc.nextLine();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] values = line.split(",");
				if (!candidates.containsKey(values[0])) {
					
					candidates.put(values[0], Integer.parseInt(values[1]));
					
				}else {
					
					int i = candidates.get(values[0]);
					candidates.put(values[0], i+(Integer.parseInt(values[1])));
					
				}	
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("ERROR: "+ e.getMessage());
		}
		
		printCandidates(candidates);
		sc.close();
		
		
	}

	
	public static void printCandidates( Map<String,Integer> T){
		StringBuffer sb = new StringBuffer();
		Set<String> names = T.keySet();
		
		for(String s : names) {
			sb.append("Candidate Name: "+ s);
			sb.append(",");
			sb.append("Total Votes: "+ T.get(s)+"\n");
		}
		
		System.out.println(sb.toString());
	}
}
