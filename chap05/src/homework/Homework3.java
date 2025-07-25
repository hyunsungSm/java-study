package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int integer = 0;
		int mid = integer / 2;
		
		while (true) {
			System.out.print("3이상 입력하세요: ");
			integer = sc.nextInt();
			
			if (integer >= 3 && integer % 2 == 1) {
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
			
		}
		int[] arr = new int[integer];
		if (integer % 2 == 1) {
			for (int i = 0; i <= mid; i++) {
				arr[i] = i + 1;
				for (int j = mid; j < integer; j++) {
					arr[j] = integer - j;
				}
			}
			for (int z = 0; z < integer; z++) {
				System.out.print(arr[z] + ", ");
			}
		}
	}
}
