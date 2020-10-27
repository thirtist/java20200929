package chap18.textbook.s180405;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("file.txt");
		FileWriter fw = new FileWriter(file,true); //true면 덮어쓰지 않고 파일 뒤에 이어서 씀
		
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("파일에 저장되었습니다.");
	}
}
