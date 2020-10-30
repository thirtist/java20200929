package chap14.lecture.api.function;

import java.util.HashMap;
import java.util.Map;

public class FunctionEx2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("java", 20);
		map.put("html", 55);
		map.put("css", 2);
		map.put("jquery", 1);
		map.put("dbms", 7);
		map.put("mysql", 99);
		
		 //.replaceAll  //BiFuction을 받아서 수정함
		map.replaceAll((k,v)-> v*2);
		
		map.forEach((k,v)-> System.out.println(k+":"+v));
	}
}
