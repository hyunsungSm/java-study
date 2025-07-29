package homework.question1;

public class Run {

	public static void main(String[] args) {
		Food food = new Food("치킨", 20000, 3);
		Book book = new Book("자바의 정석", 15000);
		
		System.out.println(food.getName() + "의 최종가격: " + food.calculateDiscount());
		System.out.println(book.getName() + "의 최종가격: " + book.calculatePrice());
		
	}

}
