package chap06.lecture.staticKeyword;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyClass o2 = new MyClass();
		
		o1.var1 = 99;
		o2.var1 = 77;
		
		o1.method1();
		o2.method1();
		
		o1.var2 = 100;
		System.out.println(o1.var2);
		System.out.println(o2.var2);
		
		o2.var2 = 200;
		System.out.println(o1.var2);
		
		MyClass.var2 = 300;
		System.out.println(o1.var2);
		System.out.println(o2.var2);
		
		System.out.println("-----------------");
		o1.method2();
		o2.method2();
		MyClass.method2();
		
	}
}
