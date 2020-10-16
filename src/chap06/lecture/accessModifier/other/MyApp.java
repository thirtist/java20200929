package chap06.lecture.accessModifier.other;

import chap06.lecture.accessModifier.MyClass;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1.var1);
//		System.out.println(o1.var2); 디폴트라서 안됨(같은패키지안 아님)
//		System.out.println(o1.var3); private라서 안됨
	}
}
