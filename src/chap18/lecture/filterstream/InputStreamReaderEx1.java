//한글
package chap18.lecture.filterstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/filterstream/InputStreamReaderEx1.java";
		InputStream is =new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(is);
		
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		
	}
}
