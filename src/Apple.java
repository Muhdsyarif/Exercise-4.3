
public class Apple extends Fruits {		// Apple as a sub class extends of fruits
	
	private String colour;
	
	public Apple(String name, String colour) {
		super(name);
		this.colour = colour;

	}

	//Overriding
	public String toString() {
		return("Color of apple: " + this.colour);
	}
	
	
}
