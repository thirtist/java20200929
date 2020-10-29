package chap14.lecture.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("java");
		names.add("html");
		names.add("css");
		names.add("jsp");
		names.add("servlet");
		
		
		//List의 메소드들중에 .forEach()라는 메소드가 있음
		// .forEach()는 파라미터로 Consumer<T>라는 객체를 받음
		// Consumer<T>는 인터페이스로 @FunctionalInterface가 붙어있음
		// -> 추상메소드가 1개 -> 람다식으로 쓸 수 있음, 사전을 보니 파라미터를 한개 받음
//		Consumer<String> o1 = s -> System.out.println(s);
		// 이런식으로 List에서 쓰인것과 동일 타입파라미터를 사용해서 람다식으로 만듦
		
		names.forEach(s -> System.out.println(s));
		// 완전 간략한 향상된 for문역할을 하는 실행문 완성
	}
}
