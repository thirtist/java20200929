package chap11.classClass;

import java.lang.reflect.Method;

public class ClassClass {
	public static void main(String[] args) throws Exception {
		
		// 1. 문자열로 얻음
		Class clazz;	//클래스타입의 객체를 얻어오는데 3가지방법
		clazz = Class.forName("java.lang.String"); //1  .forName() ->String타입-클래스의 풀네임(경로까지)
		
		// 2. 객체로 얻음
		String s = "java";
		Class c2 = s.getClass();
		
		System.out.println(clazz == c2); // 같음
		
		// 3. class 키워드로 얻음
		Class c3 = String.class;
		
		System.out.println(clazz == c2);
		System.out.println(c2==c3);
		
		Method m = clazz.getMethod("getBytes"); // .getMethod()가 리턴하는 타입은 메소드
		System.out.println(m);
//				
	}
}
