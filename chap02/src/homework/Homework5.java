package homework;

import java.awt.SystemColor;
import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
//		int a = 89;
//		int b = 73;
//		int c = 45;
//		int d = a + b + c;
//		int e = (a + b + c) / 3;
//		System.out.println("국어: " + a);
//		System.out.println("영어: " + b);
//		System.out.println("수학: " + c);
//		System.out.println("총점: " + d);
//		System.out.println("평균: " + e);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		double a = sc.nextDouble();
		
		System.out.print("영어: ");
		double b = sc.nextDouble();
		
		System.out.print("수학: ");
		double c = sc.nextDouble();

		int d = (int)(a + b + c);
		int e = d / 3;
		
		System.out.println("총점: " + d);
		System.out.println("평균: " + e);
		
		
		
		
		
		
		
		

	}

}
