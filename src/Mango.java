
public class Mango extends Fruits{		//Mango as a sub class extends of Fruits
	
	private String colour, taste;
	private double price;
	
	public Mango(String name, String colour, String taste, double price) {
		super(name);
		this.colour = colour;
		this.taste = taste;
		this.price = price;
	}
	
	//Getter
	public String getColour() {
		return this.colour;
	}
	
	public String getTaste() {
		return this.taste;
	} 
	
	public double getPrice() {
		return this.price;
	}
	
	//Overriding
	public String toString() {
		return("Color of mango: " + this.colour);
	}
	
	
}
