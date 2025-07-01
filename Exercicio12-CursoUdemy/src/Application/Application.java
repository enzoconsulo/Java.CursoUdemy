package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.entities.PMethodPaypal;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero:");
		int contractNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy):");
		LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt);
		

		System.out.print("Valor do contrato:");
		double contractValue = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas:");
		int financialMonths = sc.nextInt();
		
		Contract c = new Contract(contractNumber,contractDate,contractValue,financialMonths,new PMethodPaypal());
		
		c.makeInstallments();
		
		List<Installment> list = new ArrayList<>();
		list = c.getList();
		
		System.out.println("Parcelas:");
		for(Installment i : list) {
			System.out.print(i.getInstallmentDate().format(fmt));
			System.out.print(" - ");
			System.out.println(i.getInstallmentValue());
			
		}
		

		sc.close();

	}

}
