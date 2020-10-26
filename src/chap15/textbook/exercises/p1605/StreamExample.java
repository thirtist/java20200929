package chap15.textbook.exercises.p1605;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		
		List<String> javaList = new ArrayList<>();
		// 작성 위치
//		for (String lis : list) {
//			if (lis.indexOf("java") != -1 || lis.indexOf("Java") != -1) {
//				javaList.add(lis);
//			}
//		}
		
		for (int i =0; i <list.size(); i++) {
			String item = list.get(i);
			if (item.toLowerCase().contains("java")) {  //소문자로 바꾼후에 있는지 비교
					javaList.add(item);    
			}
		}
		
		
		
		// 출력
		for (String java : javaList) {
			System.out.println(java);
		}
	}
}





