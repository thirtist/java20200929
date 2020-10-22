package chap06.lecture.annotation;

import java.lang.reflect.Method;

public class AnnotationEx2 {
	public static void main(String[] args) throws Exception {
		Class clazz = MyClass.class;
		Method method = clazz.getMethod("method1");
		boolean anno = method.isAnnotationPresent(MyAnnotation.class); // 어노테이션이 존재하는가를 boolean으로 리턴(클래스객체를 파라미터로받음)
		System.out.println(anno); // 그런데 어노테이션은 분석할때만 쓰고 실행할때까지는 남아있지 않음 //그래서 언제남아있을지@Retention을달아줌
	}
}
