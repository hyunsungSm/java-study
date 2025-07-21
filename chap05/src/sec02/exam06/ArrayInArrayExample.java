package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 2행 3열의 2차원 배열 
		int[][] scores = new int[2][3];
		
		// 2차원 배열의 모든 요소에 접근하려면 중첩 for문이 필요
		// 바깥 for문은 => 행을 반복
		for (int i = 0; i < scores.length; i++) { // scores.length => 2
			// 안쪽 for문은 => 열을 반복
			for (int j = 0; j < scores[i].length; j++) { // scores[i].length => 3
				System.out.println("scores[" + i + "][" + j + "]=" + scores[i][j]);
			}
		}
		
		System.out.println();
		
		// 2행의 2차원 배열
		int[][] englishScore = new int[2][];
		englishScore[0] = new int[2];
		englishScore[1] = new int[3];
		
		for (int i = 0; i < englishScore.length; i++) {
			for (int j = 0; j < englishScore[i].length; j++) {
				System.out.println("englishScores[" + i + "][" + j + "]=" + englishScore[i][j]);
			}
		}
		
		System.out.println();
		
		// 값 목록으로 2차원 배열 만들기
//		int[][] javaScores = {{90, 85}, {70, 75, 14}};
		int[][] javaScores = {
							  {90, 85}, 
							  {70, 75, 14}
							  };
			
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores[" + i + "][" + j + "]= " + javaScores[i][j]);
			}
		}
	}

}
