
public class Banana extends Fruits {		//Banana as a sub class extends of fruits
	
	private String colour;
	
	public Banana(String name, String colour) {
		super(name);
		this.colour = colour;
	}

	//Overriding
	public String toString() {
		return("Colour of banana: " + this.colour);
	}
	
	
}
