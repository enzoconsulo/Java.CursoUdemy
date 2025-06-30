package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	};
	

	public Order(OrderStatus status, Client client) {
		super();
		this.moment = new Date();
		this.status = status;
		this.client = client;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
	
	public String getMoment() {
		return sdf.format(moment);
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0; 
		
		for(OrderItem i : items) {
		sum += i.subTotal();
		}
		
		return sum;
	}


	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n   Order Summary:\n\n");
		
		sb.append("Order Moment: " + this.getMoment() + "\n" );
		
		sb.append("Order Status: " + this.getStatus() + "\n" );
		
		sb.append("Client:" + client.getName());
		sb.append(" (" + client.getBirthDate() + ") ");
		sb.append("- "+ client.getEmail() + "\n");
		
		for(OrderItem i : items) {
			sb.append(i.getProduct().getName() +
					", $" + i.getProduct().getPrice() +
					", Quantity: " + i.getQuantity() +
					", Subtotal: $" + i.subTotal());
			sb.append("\n");
		}
		
		sb.append("Total Price:" + this.total());
		
		return sb.toString();
	}
	
	
	
}
