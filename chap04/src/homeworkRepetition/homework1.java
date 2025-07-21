package homeworkRepetition;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(1~50): ");
		int integer = sc.nextInt();
		
		int sum = 0;
		if (integer < 0 || integer > 50) {
				System.out.println("1~50사이의 정수를 입력하세요.");
				return;
		}
		for (int i = 0; i <= integer; i++) {
			if(i % 2 == 1) {
				continue;
			}
			sum += i;
	}
		System.out.println("합계: " + sum);
	}
}
