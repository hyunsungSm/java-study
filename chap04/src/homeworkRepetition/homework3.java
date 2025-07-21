package homeworkRepetition;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String input = sc.nextLine();
		
		for (;;) {
			if(input.equals("탈출")) {
				System.out.println("프로그램 종료");
			} else if(input.equals(input)) {
				System.out.println(input);
			}
		}
		
		
		
		
	}

}
