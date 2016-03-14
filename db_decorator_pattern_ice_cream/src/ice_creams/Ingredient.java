package ice_creams;

public abstract class Ingredient {
	String description = "Unknown ingredient";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
