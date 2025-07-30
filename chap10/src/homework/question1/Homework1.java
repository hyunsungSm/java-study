package homework.question1;

import java.time.temporal.ValueRange;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = (int) (Math.random()*50)+1;
		int count = 0;
		int num2 = 0;
		
		while(num1 != num2) {
			System.out.print("1~50사이의 숫자: ");
			num2 = sc.nextInt();			
			
			try {
				if (num2 < num1) {
					System.out.println("Up!");
					count++;
				} else if(num1 < num2) {
					System.out.println("Down!");
					count++;
				} else {
					System.out.println("축하합니다~ 정답이에요");
					System.out.println("시도횟수: " + count);
				}
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
			}
		}
	
	}

}
