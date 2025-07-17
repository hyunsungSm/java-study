package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수: ");
		int a = sc.nextInt();
		String result = (a % 2 == 0) ? "짝수" : "홀수"; 
		System.out.print("구슬의 개수는 " + result + "입니다.");
	}

}
