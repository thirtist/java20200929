package chap18.lecture.filterstream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "outputStreamReader.txt";
		FileOutputStream fos = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
//		fos.write('한'); //캐릭터는 2바이트니까 매개변수(int)에 받아들여지긴함(컴파일) // 실제로 파일에 쓸려는데 1바이트단위라서 결국 1바이트만씀
		
		osw.write('한');
		
		osw.close();
		fos.close();
	}
}
