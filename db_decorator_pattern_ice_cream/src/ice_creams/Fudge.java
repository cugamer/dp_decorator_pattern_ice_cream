package ice_creams;

public class Fudge extends MixIn {
	Ingredient ingredient;
	
	public Fudge(Ingredient ingredient){
		this.ingredient = ingredient;
	}

	public String getDescription() {
		return ingredient.getDescription() + ", creamy chocolate fudge";
	}

	@Override
	public double cost() {
		return ingredient.cost() + .40;
	}

}
