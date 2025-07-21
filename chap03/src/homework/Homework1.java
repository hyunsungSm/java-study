package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요: ");
		String speak = sc.nextLine();
		
		// 변수 쪽에 equals()를 호출하면, input이 null일 경우 예외(NPE)가 발생할 수 있음
//		String result = speak.equals("간다") ? "온다" : "간다";
		// 리터럴이나 상수를 앞에 두면, input이 null이어도 안전하게 비교 가능(null-safe)
		String result = "간다".equals(speak) ? "온다" : "간다";
		System.out.print("앵무새: " + result);
	}

}
