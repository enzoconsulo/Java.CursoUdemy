/**
 * 
 */
package entities;

public class rectangle {
	public double weight;
	public double height;
	
	public double area() {
		return weight*height;
	}
	
	public double perimeter(){
		return 2*(weight*height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(weight, 2)+ Math.pow(height, 2));
	}
}
