package chap08.lecture.anonymousClass;

public class MyApp {
	public static void main(String[] args) {
		MyInterface o1 = new MyClass();
		o1.method1();

		MyInterface o2 = new MyInterface() {

			@Override
			public void method1() {
				System.out.println("anonymous class method1");
			}
		};
	}
}
