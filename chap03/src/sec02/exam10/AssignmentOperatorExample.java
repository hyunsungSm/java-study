package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		
		result += 10; // result = result + 10
		System.out.println("result=" + result);
		
		result -= 5; // result = result - 5
		System.out.println("result=" + result);
		
		result *= 3; // result = result * 3
		System.out.println("result=" + result);
		
		result /= 5; // result = result / 5
		System.out.println("result=" + result);
		
		result %= 3; // result = result % 3
		System.out.println("result=" + result);
		
		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원: 11개
//		100원: 1개
//		50원: 0개
//		10원: 4개
//		1원: 0개
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요: ");
		int a = sc.nextInt();
		int b = a / 500;
		int c = ((a % 500) / 100);
		int d = ((a % 500) % 100) / 50;
		int e = ((a % 500) % 100) / 10;
		int f = (((a % 1000) % 500) % 100) % 10;
		System.out.println("500원: " + b + "개");
		System.out.println("100원: " + c + "개");
		System.out.println("50원: " + d + "개");
		System.out.println("10원: " + e + "개");
		System.out.println("1원: " + f + "개");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
