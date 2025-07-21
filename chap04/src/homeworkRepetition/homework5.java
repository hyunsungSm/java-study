package homeworkRepetition;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num1;
		
		while (true) {
			System.out.print("숫자(0을 입력하면 종료): ");
			num1 = sc.nextInt();
			
			if (num1 == 0) {
				break;
			}
			if (num1 > 0) {
				sum += num1;
			}
		}
		System.out.println("양수의 합계: " + sum);
		
	}

}
