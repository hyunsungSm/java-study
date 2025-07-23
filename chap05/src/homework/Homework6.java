package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요: ");
		int size = sc.nextInt();
		
		String[] array = new String[size];
		int count = 1;
		while(true) {
			System.out.print(count + "번째 문자열: ");
			String str = sc.nextLine();
			count++;
			
			for (int i = 0; i < size; i++) {
				array[i] = str;
			}
		}
		
		
	}

}
