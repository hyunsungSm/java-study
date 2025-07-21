package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("당신의 놀이동산 요금은: ");
		if (age >= 19 && age < 65) {
			System.out.println("30000원입니다.");
		} else if (age >= 13 && age < 19) {
			System.out.println("20000원입니다.");
			
		} else if (age >= 3 && age < 13) {
			System.out.println("10000원입니다.");
			
		} else {
			System.out.println("무료입니다.");
			
		}
	}

}
