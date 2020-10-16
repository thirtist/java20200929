package chap06.textbook.s061303.package1;

public class B {
	public B() {
		A a=new A();
		a.field1 = 1;  //o
		a.field2 = 2;  //o
		a.field3 = 1;  //x private 접근불가
		
		a.method1();  //o
		a.method2();  //o
		a.method3();  //x private 접근불가
	}
}
