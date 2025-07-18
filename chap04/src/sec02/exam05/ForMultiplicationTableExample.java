package sec02.exam05;

import java.util.Iterator;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 구구단 출력하기
		// 중첩 for문(여기서는 이중 for문 사용)
		int result = 0;
		for (int i = 2;i < 10; i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j = 1; j < 10; j++) {
				result = i * j;
				System.out.println(i + " X " + j + " = " + result);
			}
			System.out.println();
		}
		
		// 참고: for문 중첩 시 퍼포먼스가 떨어짐
		// 삼중을 넘어가면 잘 안씀
	}

}
