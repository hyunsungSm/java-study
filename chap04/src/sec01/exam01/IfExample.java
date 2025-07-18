package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) { // 조건식이 true 이기 때문에 if문 내부가 실행
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급이 A입니다.");
		}
		
		if (score < 90)  // 조건식이 false 이기 때문에 if문 내부가 실행 안함
			System.out.println("점수가 90보다 작습니다."); // 중괄호가 생략된 if문의 범위는 다음 실행문 하나까지
			System.out.println("등급이 B입니다.");
			
		// 코드가 아직 익숙하지 않을 때는 실행문이 하나뿐인 경우에도 중괄호 써주기
	}

}
