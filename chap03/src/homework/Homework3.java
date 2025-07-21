package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친구 수: ");
		int friend = sc.nextInt();
		
		System.out.print("사탕의 수: ");
		int candy = sc.nextInt();
		
		int result = candy / friend;
		int result2 = candy % friend;
		
		System.out.println("1인당 사탕 개수: " + result + "개");
		System.out.println("남는 사탕 개수: " + result2 + "개");
	}

}
