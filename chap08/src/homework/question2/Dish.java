package homework.question2;

public class Dish extends Menu {
	private String ingredients;
	
	public Dish(String name, int price, String ingredients) {
		super(name, price);
		this.ingredients = ingredients;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public String cook() {
		return super.toString() + "재료는 " + ingredients + "입니다."; 
	}
}
