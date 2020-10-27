package chap18.lecture.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "output.txt";
		OutputStream os = new FileOutputStream(path);
		
		os.write(65);
		os.write(66);
		
		byte[] datas = new byte[3];
		datas[0] = 67;
		datas[1] = 68;
		datas[2] = 69;

		os.write(datas);
		os.write(datas,0,2);
		
		os.close();
	}
}
