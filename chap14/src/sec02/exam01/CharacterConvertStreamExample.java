package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	// 파일로 문자를 저장하고, 저장된 문자를 다시 읽는 예제
	// 사용하는 소스 스트림(기본 스트림)은 바이트 기반 입출력 스트림이지만, 
	// 이들 스트림을 직접 사용하지 않고 각각 Reader와 Writer로 변환해서 사용
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		read();
		
	}

	private static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test1.txt"); // 바이트 기반 출력 스트림
		// 편의를 위해 보조 스트림을 연결해서 문자 -> 바이트로 자동 변환
		Writer writer = new OutputStreamWriter(os); // 문자 기반 출력 보조 스트림 연결
		
		writer.write(str); // 문자열을 바로 쓸 수 있음
		writer.flush();
		writer.close();
	}
	
	private static void read() throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.txt"); // 바이트 기반 입력 스트림
		// 편의를 위해 보조 스트림을 연결해서 문자 -> 문자로 자동 변환
		Reader reader = new InputStreamReader(is);
		
		char[] buffer = new char[100];
		int readNum = reader.read(buffer); // 보조 스트림 연결로 char[] 이용 가능!
		reader.close();
		
		// 디코딩이 되어 문자로 바로 읽을 수 있음
		for (int i = 0; i < readNum; i++) {
			System.out.print(buffer[i]);
		}
		System.out.println();
	}


}
