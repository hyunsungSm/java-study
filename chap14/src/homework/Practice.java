package homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Practice {
	String song = "나비야, 나비야 이리 날아오너라"
			+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
			+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
			+ "\n참새도 짹짹짹 노래하며 춤춘다";

	byte[] bytes = song.getBytes();
	
	public void method1() {
			try (OutputStream os = new FileOutputStream("C:/test/sub/나비야1.dat")) {
				os.write(bytes);
				os.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	public void method2() {			
			try {
				OutputStream os = new FileOutputStream("C:/test/sub/나비야2.dat");
				BufferedOutputStream bos = new BufferedOutputStream(os);
				bos.write(bytes);
				bos.flush();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 	
	}
	
	public void method3() {
		try {
			InputStream is = new FileInputStream("C:/test/sub/나비야1.dat");
			is.read(bytes);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method4() {
		try {
			InputStream is = new FileInputStream("C:/test/sub/나비야2.dat");
			BufferedInputStream bis = new BufferedInputStream(is);
			bis.read(bytes);
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
	}
	
	public long nano() {
		long start = System.nanoTime();
		long end = System.nanoTime();
		System.out.println(end - start);
		return end - start;
	}
}
