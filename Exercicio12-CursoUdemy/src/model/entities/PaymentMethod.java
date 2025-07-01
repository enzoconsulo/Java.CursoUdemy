package model.entities;

public interface PaymentMethod {

	public double paymentTax(double value);
	public double mensalFee(double bruteMensalValue , int month);
	
}
