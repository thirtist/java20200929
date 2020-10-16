package chap07.lecture.accessModifier.other;

import chap07.lecture.accessModifier.MyClass;

public class OtherClass{
	void method1() {
		MyClass o1 = new MyClass();
		System.out.println(o1.publicVar);
		System.out.println(o1.protectedVar); // 다른패키지므로 불가
		System.out.println(o1.defaultVar);// 다른패키지므로 불가
	}
}
