package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("총합: " + sum);
		
		double avg = sum / (double) scores.length;
		System.out.println("평균: " + avg);
		
		// 정리:
		// 기본 for문 보다 코드가 간결하여 자주 쓰임
		// 배열 index 값의 사용이 필요할 때 기본 for문 사용
	}

}
