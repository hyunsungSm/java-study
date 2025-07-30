package homework.question3;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String str = sc.nextLine();
		
		CharacterController cc = new CharacterController();
		
		try {
			cc.countAlpha(str);
			
		} catch (CharCheckException e) {
			System.out.println(e.getMessage());
		}
	}
}
