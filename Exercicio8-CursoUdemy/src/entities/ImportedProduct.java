package entities;


public class ImportedProduct extends Product{

	private Double customsFee;
	
	public ImportedProduct(){
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return String.format("%s $ %.2f (Customs fee: $ %.2f)", name, this.totalPrice(),customsFee);
	}
	
	
}
