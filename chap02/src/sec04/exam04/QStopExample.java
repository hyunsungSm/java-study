package sec04.exam04;

import java.io.IOException;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while (true) { // 무한반복
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			// q를 입력하면 종료되도록 만들기
			if (keyCode == 113) {
				break; // keyCode가 113과 동일하면 실행
			}
		}
		
		System.out.println("종료");
	}

}
