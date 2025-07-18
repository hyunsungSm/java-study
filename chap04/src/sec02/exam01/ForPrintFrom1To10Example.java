package sec02.exam01;

import java.util.Iterator;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// for문
//		for (1. 초기화식; 2. 조건식; 4. 증감식 ) {
//			3. 실행문
//		}
		// 참고로 4번에는 모든 증감식이 올 수 있음
		// (예: i++, i--, i = i + 2, i = i * 10 등)
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
