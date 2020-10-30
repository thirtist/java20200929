package chap14.lecture.api.function;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FunctionEx3 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap14/lecture/api/function/FunctionEx3.java";
		FileReader fr = new FileReader(path);
		
		Map<Character, Integer> map = new HashMap<>();
		
		int ch;
		
		while ( ( ch = fr.read() ) != -1) {
			if(('a' <= ch && ch <='z') || ('A' <= ch && ch <='Z')) {
				char c = (char)ch;
//				System.out.println(c);
				
				map.compute(c, (k,v) -> v == null ? 1 : v+1);
			}
		}
		
		map.forEach((k,v)-> System.out.println(k+":"+v));
		
		
		fr.close();
	}
}
