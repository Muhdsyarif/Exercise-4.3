
public class Main {

	public static void main(String[] args) {
		
		Apple a = new Apple("Apple", "Red");
		System.out.println(a);
		System.out.println();
		
		Banana b = new Banana("Banana", "Yellow");
		System.out.println(b);
		System.out.println();
		
		Orange o = new Orange("Orange Mandarin", 0.98, 2.00);
		System.out.println(o);
		o.calPrice();
		System.out.println("Discounts(15%): RM" + o.calPrice(15));
		System.out.println("New Price: RM" + o.calPrice(15, 2.00));
		System.out.println();
		
		Watermelon w = new Watermelon("Watermelon", 500, 9.00);
		System.out.println(w);
		w.calPrice();
		System.out.println("Discounts(15%): RM" + w.calPrice(15));
		System.out.println("New Price: RM" + w.calPrice(15, 9.00));
		
		Mango m = new Mango("Mango", "Green", "Sour", 5.00);
		System.out.println(m);
	}

	
}
