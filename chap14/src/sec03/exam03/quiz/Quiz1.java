package sec03.exam03.quiz;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Quiz1 {
//	Quiz
//	C 드라이브 아래에 test/sub 폴더를 생성하는데
//	아래와 같이 test/sub 경로에 오늘 날짜 이름의 폴더를 생성하세요.
//	오늘 날짜 정보는 LocalDate를 통해서 가져옵니다.

//	C:/test/sub/2025/08/08

//	해당 폴더가 없을 때만 생성될 수 있도록 조건문을 반드시 추가하세요.

//	상황에 맞게 아래의 문장을 출력하세요.

//	[출력]
//	폴더 생성 성공
//	폴더 생성 실패
//	이미 존재하는 폴더
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		Month month = today.getMonth();
		int day = today.getDayOfMonth();
		
		File dir = new File("C:/test/sub/" + "\\" + year + "\\" + month + "\\" + day);
		
		if (!dir.exists()) {
			dir.mkdirs();  
			System.out.println("폴더 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}
		
		System.out.println(dir);
		
	}

}
