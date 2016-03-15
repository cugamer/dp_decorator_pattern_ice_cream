package ice_creams;

public class Blueberries extends MixIn {
	Ingredient ingredient;
	
	public Blueberries(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public String getDescription() {
		return ingredient.getDescription() + ", blueberries";
	}

	public double cost() {
		return ingredient.cost() + .40;
	}

}