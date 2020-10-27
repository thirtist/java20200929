package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx1.java";
		InputStream is = new FileInputStream(path);
		
		int cnt = 0;
		int r =0;
		while ((r = is.read()) !=-1) {
			System.out.print((char)r);
			cnt++;							//파일크기만큼 1바이트씩 읽음
		};
		is.close();
	}
}
