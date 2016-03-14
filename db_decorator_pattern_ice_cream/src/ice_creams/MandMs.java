package ice_creams;

public class MandMs extends MixIn {
	Ingredient ingredient;
	
	public MandMs(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public String getDescription() {
		return ingredient.getDescription() + ", M & M candies";
	}

	public double cost() {
		return ingredient.cost() + .30;
	}

}
