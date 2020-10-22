package chap13.lecture;

public class MyClass<T> {
	public void method1() {
		System.out.println("메소드1");
	}
	
	public void method2(T s) {
		System.out.println(s);
	}
}
