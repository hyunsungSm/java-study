package homeworkRepetition;

import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int integer = sc.nextInt();
		
		while (integer <= 0) {
			System.out.println("양수가 아닙니다.");
			System.out.print("정수: ");
			integer = sc.nextInt();			
		}
		
		for (int i = 0; i < integer; i++) {
			if (i % 2 == 0) {
				System.out.print("박");
			} else {
				System.out.print("수");
			}
		}
		
	}

}
