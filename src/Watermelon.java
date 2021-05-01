
public class Watermelon extends Fruits{		//Watermelon as a sub class extends of Fruits
	
	private double weight, price;
	
	public Watermelon(String name, double weight, double price) {
		super(name);
		this.weight = weight;
		this.price = price;
	}
	
	//Method for overloading
	public void calPrice() {		// without parameter
		System.out.println("Watermelon price: RM" + this.price);
	}
		
	public double calPrice(double discounts) {		// 1 parameter
		discounts = (discounts/100)*price;
		return discounts;
	}
		
	public double calPrice(double discounts, double lastTotal) {		// 2 parameter
		discounts = (discounts/100)*price;
		lastTotal = price-discounts;
		return lastTotal;
	}
	
	//overriding
	public String toString() {
		return("Weight: " + this.weight + "g");
	}
	
	//Getter
	public double getWeight() {
		return this.weight;
	}
	
	public double getPrice() {
		return this.price;
	}
		

}
