package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리의 숫자를 입력하세요: ");
		char str = sc.nextLine().charAt(0);
		
		//char 타입의 숫자형 문자를 정수로 변환하여 계산
		int chr = str - '0'; // 연산 시 자동 형변환(char -> int)이 발생
		int digit = chr * chr;
		System.out.println("입력한 숫자의 제곱은: " + digit);
		
	}

}
