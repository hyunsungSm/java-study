package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int integer = sc.nextInt();
		int[] array = new int[integer];
		int mid = integer / 2;
		
		while (integer % 2 == 0 || integer < 3) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수: ");
			integer = sc.nextInt();
			
		}
		if (integer % 2 == 1) {
			for (int i = 0; i <= mid; i++) {
				array[i] = i + 1;
				for (int j = mid; j < integer; j++) {
					array[j] = integer - j;
				}
			}
			for (int num : array) {
				System.out.print(num + ", ");
			}
		}
	}
}
