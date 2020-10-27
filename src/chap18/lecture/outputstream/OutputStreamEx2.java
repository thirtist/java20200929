package chap18.lecture.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx2 {
	public static void main(String[] args) throws Exception {
		String source = "bts.jpg";
		String copy = "bts-copy.jpg";
		
		InputStream is = new FileInputStream(source);
		OutputStream os = new FileOutputStream(copy);
		
		int b = 0;
		
		while ((b=is.read()) !=-1 ) {
			os.write(b);
		}
		
		is.close();
		os.close();
	}
}
