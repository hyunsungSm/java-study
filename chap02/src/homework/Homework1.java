package homework;

public class Homework1 {

	public static void main(String[] args) {
		double weight = 70.0;
		float height = 1.80f;
		double bmi = weight / (height * height);
		
		System.out.println("몸무게(kg): " + weight);
		System.out.println("키(m): " + height);
		System.out.println("BMI 지수: " + bmi);
	}

}
