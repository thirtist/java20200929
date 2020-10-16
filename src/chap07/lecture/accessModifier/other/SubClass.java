package chap07.lecture.accessModifier.other;

import chap07.lecture.accessModifier.MyClass;

public class SubClass extends MyClass {
	void method1() {
		MyClass o1 = new MyClass();
		System.out.println(o1.publicVar);
		System.out.println(protectedVar);
//		System.out.println(o1.protectedVar);//객체에 만들어진거라서 접근불가
//		System.out.println(o1.defaultVar); // 다른패키지라서 불가
	}
}
