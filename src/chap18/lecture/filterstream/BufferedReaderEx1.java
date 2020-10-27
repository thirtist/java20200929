package chap18.lecture.filterstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/filterstream/BufferedReaderEx1.java";
		// 디렉토리를 나누는 / 이거는 유닉스 스타일,    윈도우는\스타일 -> 근데 자바에서는 키워드같은걸로 쓰이니까 \\이렇게 사용해야함
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		System.out.println(line);
		
		br.close();
		fr.close();
		
	}
}
