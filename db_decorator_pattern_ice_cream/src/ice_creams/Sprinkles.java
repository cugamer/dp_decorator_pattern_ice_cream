package ice_creams;

public class Sprinkles extends MixIn {
	Ingredient ingredient;
	
	public Sprinkles(Ingredient ingredient){
		this.ingredient = ingredient;
	}

	public String getDescription() {
		return ingredient.getDescription() + ", rainbow sprinkles";
	}

	public double cost() {
		return ingredient.cost() + .25;
	}

}
