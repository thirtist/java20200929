package chap06.textbook.s061303.package2;

import chap06.textbook.s061303.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;  //o
		a.field2 = 2;  //x
		a.field3 = 1;  //x private 접근불가
		
		a.method1();  //o
		a.method2();  //x
		a.method3();  //x private 접근불가
	}
	
	
}
