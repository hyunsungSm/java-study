package homeworkCondition;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월: ");
		int month = sc.nextInt();
		System.out.print("기온: ");
		int temp = sc.nextInt();
		
		
		// Early return pattern
		// 에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조
		// 장점; 1) 코드 가독성이 좋아짐 2) 코드의 중첩을 줄일 수 있음
		
		if (month >= 3 && month < 6) {
			System.out.println("봄");
		} else if (month >= 6 && month < 9 && temp >= 33 && temp < 35) {
			System.out.println("여름 폭염 주의보");
		} else if (month >= 6 && month < 9 && temp >= 35) {
			System.out.println("여름 폭염 경보");
		} else if (month >= 9 && month < 12) {
			System.out.println("가을");
		} else if (month >= 12 && month < 3 && temp <= -12 && temp > -15) {
			System.out.println("겨울 한파 주의보");
		} else if (month >= 12 && month < 3 &&  temp <= -15) {
			System.out.println("겨울 한파 경보");
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}
	}

}
