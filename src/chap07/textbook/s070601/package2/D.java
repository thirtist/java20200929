package chap07.textbook.s070601.package2;

import chap07.textbook.s070601.package1.A;

public class D extends A {
	public D() {
		super();  //(o)
		this.field = "value";  //(o)
		this.method();  //(o)   자식이면 다른패키지에 있어도 접근가능
	}
}
