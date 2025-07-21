package homeworkRepetition;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			input = sc.nextLine();
						
		} while (input.equals("yes"));
		System.out.println("게임을 종료합니다.");
		
	}

}
