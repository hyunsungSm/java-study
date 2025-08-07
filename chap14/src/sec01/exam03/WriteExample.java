package sec01.exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		// 출력할 바이트 배열
		byte[] array = {10, 20, 30, 40, 50};
		
		// 바이트 데이터를 배열로 출력 시 출력 범위를 지정 가능
		// 주어진 배열의 off 번째 위치부터 len개 까지의 바이트를 출력
		// 1번 인덱스부터 3개를 출력
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
	}

}
