package ice_creams;

public class ColdSlabCreamery {
	public static void main(String[] args){
		System.out.println("Welcome to Cold Slab!");
		
		Ingredient iceCream1 = new StrawberryIceCream();
		System.out.println(iceCream1.getDescription());
		System.out.println(iceCream1.cost());
		
		Ingredient iceCream2 = new ChocolateIceCream();
		iceCream2 = new MandMs(iceCream2);
		iceCream2 = new MandMs(iceCream2);
		System.out.println(iceCream2.getDescription());
		System.out.println(iceCream2.cost());
		
		Ingredient iceCream3 = new BubblegumIceCream();
		iceCream3 = new MandMs(iceCream3);
		iceCream3 = new Blueberries(iceCream3);
		System.out.println(iceCream3.getDescription());
		System.out.println(iceCream3.cost());
		
		Ingredient iceCream4 = new StrawberryIceCream();
		// This person wants double sprinkles
		iceCream4 = new Sprinkles(iceCream4);
		iceCream4 = new Sprinkles(iceCream4);
		iceCream4 = new Fudge(iceCream4);
		System.out.println(iceCream4.getDescription());
		System.out.println(iceCream4.cost());
	}
}
