package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Item;

public class Program {

	public static void main(String[] args) {
		
		String pathRead = new String("C:\\Users\\enzo\\eclipse-workspace\\Exercicio11\\src\\source.csv");
		List<Item> listItems = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(pathRead))){
			
			String content = br.readLine();			

			while (content != null) {
				String[] itemValues = content.split(",");
				listItems.add(new Item(itemValues[0], Double.parseDouble(itemValues[1]),Integer.parseInt(itemValues[2])));
				content = br.readLine();
			}
		}catch (IOException e) {
			System.out.println("ERROR : " + e.getMessage());
		}
		
		String pathOut = new String("C:\\Users\\enzo\\eclipse-workspace\\Exercicio11\\src" + "\\Out");
		File out = new File(pathOut); 
		out.mkdir();
		
		String summaryPath = new String(pathOut + "\\summary.csv");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(summaryPath))){
			for (Item i : listItems) {
				String toPrint = i.toString();
				bw.write(toPrint);
				bw.newLine();
			}
		}catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		
		System.out.println("Arquivo lido e Gerado com Sucesso!");
	}
}
