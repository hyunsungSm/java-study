package homeworkMethod;

public class Homework2 {
	String message;
	int sum;
	int count;

	String message(String str1) {
		return str1;
	}
	
	int sum(int x, int y) {
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}
	
	int integer(int x) {
		if (x % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		return x;
	}
	
	int check(String x, String y) {
		String str = x;
		char ch = y.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
				System.out.println("개수: " + count);
			}
		}
		return count;
	}
	
	
	int goo(int x) {
		for(int i = x; i <= x; i++) {
			System.out.println("=== " + i + "단 ===");
			for(int j = 1; j < 10; j++) {
				sum = i * j;
				System.out.println(i + "X" + j + "= " + sum);
			}
		}
		return x;
	}
	
	

}
