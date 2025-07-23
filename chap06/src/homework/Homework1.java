package homework;

public class Homework1 {
	String str1;
	String str2;
	int num1;
	int num2;
	
	void sum(String str1, String str2) {
		String result = str1 + str2;
		System.out.println(result);
	}
	
	int calc(int num1, int num2) {
		int result2 = num1 * num2;
		if (num1 < num2) {
			System.out.println("계산할 수 없습니다.");
			return result2;
		}
		System.out.println("결과: " + result2);
		return result2;
	}
	
	void equal(String str1, String str2) {
		if (str1.equals(str2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	
	

}
