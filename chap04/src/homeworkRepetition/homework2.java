package homeworkRepetition;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		int result = 0;
		if (num > 9) {
			System.out.println("9이하의 숫자를 입력하세요.");
			return;
		} else if(num < 0) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
		for (int i = 1; i <= num; i++) {
			System.out.println("=== " + i + "단 ===");
			for (int j = 1; j < 10; j++) {
				result = num * j;
				System.out.println(num + " * " + j + " = " + result);
			}
			System.out.println();
		}
		
		
		
	}

}
