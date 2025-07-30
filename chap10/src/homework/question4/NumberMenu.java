package homework.question4;

import java.awt.SystemColor;
import java.util.Scanner;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		NumController numc = new NumController();
		
		try {
			numc.checkDouble(num1, num2);
			
		} catch (NumRangeException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
