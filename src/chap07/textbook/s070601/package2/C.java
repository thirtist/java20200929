package chap07.textbook.s070601.package2;

import chap07.textbook.s070601.package1.A;

public class C {
	public void method() {
		A a = new A();  //(x)
		a.field = "value";  //(x)
		a.method();  //(x)   다른패키지면 접근 불가
	}
}
