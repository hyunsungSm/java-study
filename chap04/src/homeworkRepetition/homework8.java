package homeworkRepetition;

import java.util.Scanner;

public class homework8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String str1 = sc.nextLine();
		System.out.print("문자: ");
		char str2 = sc.nextLine().charAt(0);
		System.out.print("다시 입력하시겠습니까?: ");
		String str3 = sc.nextLine();
		
		while (str3.equals("Y")) {
			System.out.print("문자열: ");
			str1 = sc.nextLine();
			System.out.print("문자: ");
			str2 = sc.nextLine().charAt(0);
			System.out.print("다시 입력하시겠습니까?: ");
			str3 = sc.nextLine();
		}
		for (int i = 0; i < str1.length(); i++) {
			
		}
		
		
	}

}
