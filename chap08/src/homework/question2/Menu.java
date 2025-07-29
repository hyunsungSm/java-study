package homework.question2;

public abstract class Menu {
	private String name;
	private int price;
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "메뉴명은 " + name + "이고, 가격은 " + price + "이다.";
	}
	
	public abstract String cook();

}
