package homework.question2;

public class Run {

	public static void main(String[] args) {
		Menu[] menus = new Menu[5];
		
		int num = (int) Math.random(); 
		for (int i = 0; i < menus.length; i++) {
			
			if (num == 0) {
				menus[i] = new Dish("스테이크", 30000, "소고기, 소금, 후추");
			} else {
				menus[i] = new Drink("아메리카노", 5000, "에스프레소 1샷, 물");				
			}
		}
		
		for (Menu m : menus) {
			m.cook();
		}
	}

}
