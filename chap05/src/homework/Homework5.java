package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		String[] choices = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		
		int game = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while (true) {
			System.out.print("가위바위보: ");
			String srp = sc.nextLine();
			
			if (srp.equals("stop")) {
				System.out.println(game + "전 " + win +"승 " + draw + "무 " + lose + "패");
				break;
			}
			
			if (!srp.equals("가위") && !srp.equals("바위") && !srp.equals("보")) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			int index = (int)(Math.random() * choices.length);
			String randomchoices = choices[index];
			System.out.print("컴퓨터: " + randomchoices);
			System.out.println();
			System.out.println("사용자: " + srp);
			
			if (srp.equals(randomchoices)) {
				System.out.println("비겼습니다");
				draw++;
				game++;
			} else if ((srp.equals("보") && randomchoices.equals("바위")) || (srp.equals("가위") && randomchoices.equals("보")) || (srp.equals("바위") && randomchoices.equals("가위"))) {
				System.out.println("이겼습니다!");
				win++;
				game++;
			} else {
				System.out.println("졌습니다.. ㅠㅠ");
				lose++;
				game++;
			}
			
			
		}
	}

}
