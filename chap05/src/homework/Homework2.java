package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int integer = sc.nextInt();
		int[] array = new int[integer];
		int integer2 = 0;
		int sum = 0;
		
		for (int i = 0; i < integer; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값: ");
			integer2 = sc.nextInt();
			array[i] = integer2;
		}
		
		if (integer2 > 0) {
			sum += integer2;
		}
		System.out.println("총합: " + sum);
	}

}
