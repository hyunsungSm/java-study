package sec01.exam13.quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Quiz2 {
//	Quiz
//	"자바 프로그래밍입니다."가 저장된 "C:/Temp/test.txt" 파일을 
//	"C:/Temp/test_copy.txt" 로 복사하는 코드를 구현해 보세요.
	
//	힌트: Reader를 사용해 원본 파일에서 읽어온 데이터를 Writer를 사용해 타겟 파일로 바로 출력
	
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		Writer writer = new FileWriter("C:/Temp/test_copy.txt");
		
		
		char[] array = new char[1024];
		int readNum = reader.read(array);
		String str = new String(array);
		
		writer.write(str);
		
		writer.flush();
		writer.close();
		
		
		
	}

}
