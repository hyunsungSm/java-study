package sec04.exam05.quiz;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle() {		
	}
	
	void area() {
		int area = width * height;
		System.out.println("면적: " + area);
	}
	
	void length() {
		int length = (2 *(width + height));
		System.out.println("둘레: " + length);		
	}

}
