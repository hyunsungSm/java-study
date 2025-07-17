package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int korean = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		System.out.print("영어: ");
		int english = sc.nextInt();
		
		int a = korean + math + english;
		int b = a / 3;
		System.out.println("합계: " + a);
		System.out.println("평균: " + b);
		String result1 = (b < 90) ? "휴대폰을 바꿀 수 없습니다." : "휴대폰을 바꿀 수 있습니다.";
		System.out.println(result1);
	}

}
