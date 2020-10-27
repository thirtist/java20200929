package chap18.textbook.s180502;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1
		= new FileInputStream ("01. 기본 타입과 참조 타입의 차이.png");
		start = System.currentTimeMillis();
		while (fis1.read() !=-1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때" + (end-start) + "ms");
		
		fis1.close();
		
		FileInputStream fis2
		= new FileInputStream ("01. 기본 타입과 참조 타입의 차이.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() !=-1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때" + (end-start) + "ms");
		
		fis2.close();
	}
}
