package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer contractNumber;
	private LocalDate contractDate;
	private Double contractValue;
	private Integer financialMonths;
	
	private PaymentMethod pm;
	
	private List<Installment> list = new ArrayList<>();
	


	public Contract(Integer contractNumber, LocalDate contractDate, Double contractValue, Integer financialMonths, PaymentMethod pm) {
		
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.contractValue = contractValue;
		this.financialMonths = financialMonths;
		this.pm = pm;
		
	}


	public Integer getContractNumber() {
		return contractNumber;
	}


	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}


	public LocalDate getContractDate() {
		return contractDate;
	}


	public void setContractDate(LocalDate contractDate) {
		this.contractDate = contractDate;
	}


	public Double getContractValue() {
		return contractValue;
	}


	public void setContractValue(Double contractValue) {
		this.contractValue = contractValue;
	}


	public Integer getFinancialMonths() {
		return financialMonths;
	}


	public void setFinancialMonths(Integer financialMonths) {
		this.financialMonths = financialMonths;
	}


	public PaymentMethod getPm() {
		return pm;
	}


	public void setPm(PaymentMethod pm) {
		this.pm = pm;
	}
	

	public List<Installment> getList() {
		return list;
	}


	public double bruteMensalValue() {
		
		return getContractValue()/getFinancialMonths();
	}
	
	public double calculateInstallments(int month) {
		
		double mensalValue = pm.mensalFee(bruteMensalValue(), month);
		
		double totalMensalValue = bruteMensalValue() + mensalValue;
		
		totalMensalValue += pm.paymentTax(totalMensalValue);
		
		return totalMensalValue;
		
	}
	
	
	public void makeInstallments() {
		
		for(int i = 1 ; i<=getFinancialMonths();i++) {
			
			Installment n = new Installment(contractDate.plusMonths(i),calculateInstallments(i));
			
			list.add(n);
			
		}
		
	}

}
