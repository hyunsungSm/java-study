package homework.question1;

public class Food extends Product {
	private int expirationDays;
	
	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}
	
	int calculateDiscount() {
		if (expirationDays <= 1) {
			return calculatePrice() - (int) (calculatePrice() * 0.2);
		} else if(expirationDays <= 5) {
			return calculatePrice() - (int) (calculatePrice() * 0.5);
		} else if(expirationDays <= 10) {
			return calculatePrice() - (int) (calculatePrice() * 0.8);			
		} else {
			return calculatePrice();
		}
	}
	
	@Override
	int calculatePrice() {
		return super.getPrice();
	}
	

}
