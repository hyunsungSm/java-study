package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수: ");
		int integer = sc.nextInt();
		int[] array = new int[integer];
		
		if (integer % 2 == 1) {
			for (int i = 0; i < integer; i++) {
				array[i] = i + 1;
			}
		} else {
			System.out.println("다시 입력하세요.");
		}
		
		System.out.println(array);
	}

}
