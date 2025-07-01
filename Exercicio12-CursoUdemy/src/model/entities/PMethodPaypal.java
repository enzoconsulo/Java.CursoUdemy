package model.entities;

public class PMethodPaypal implements PaymentMethod{
	
	private static Double feeValue = 0.01;
	
	@Override
	public double paymentTax(double value) {
		return value * 0.02;
	}

	@Override
	public double mensalFee(double bruteMensalValue , int month) {

		return bruteMensalValue * feeValue * month;
		
	}
	

}
