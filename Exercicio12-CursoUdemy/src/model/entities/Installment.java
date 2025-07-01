package model.entities;

import java.time.LocalDate;

public class Installment {

	private LocalDate installmentDate;
	private Double installmentValue;

	
	public Installment() {
	}
	
	public Installment(LocalDate installmentDate, Double installmentValue) {
		this.installmentDate = installmentDate;
		this.installmentValue = installmentValue;
	}

	public LocalDate getInstallmentDate() {
		return installmentDate;
	}

	public void setInstallmentDate(LocalDate installmentDate) {
		this.installmentDate = installmentDate;
	}

	public Double getInstallmentValue() {
		return installmentValue;
	}

	public void setInstallmentValue(Double installmentValue) {
		this.installmentValue = installmentValue;
	}

}
