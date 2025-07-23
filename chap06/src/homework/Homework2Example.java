package homework;

import java.util.Scanner;

public class Homework2Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메시지를 입력하세요: ");
		String message = sc.nextLine();
		Homework2 homework2 = new Homework2();
		
		String result1 = homework2.message(message);
		System.out.println(result1);
		
		System.out.print("숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result2 = homework2.sum(num1, num2);
		System.out.println("합계: " + result2);
		
		System.out.print("정수를 입력하세요: ");
		int num3 = sc.nextInt();
		
		int result3 = homework2.integer(num3);	
		
		System.out.print("문자열을 입력하세요: ");
		String str1 = sc.nextLine();
		System.out.println("문자를 입력하세요: ");
		char ch = sc.nextLine().charAt(0);
		
		String result4 = homework2.check(str1, ch);
		
		System.out.print("정수를 입력해주세요: ");
		int num4 = sc.nextInt();
		
		int result5 = homework2.goo(num4);
		
		
		
		
		
		
		
		
	}

}
