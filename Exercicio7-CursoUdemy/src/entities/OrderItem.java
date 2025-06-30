package entities;

public class OrderItem {

	private int quantity;
	private Product product;
	private double price;
	
	public OrderItem() {
	};

	
	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	};
	
	public double subTotal(){
		return (quantity * price);
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	};
	
}
