package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1.......");
	}
	void method1(int i) {
		System.out.println("method1#######");
	}
//	void method1(int j) {  // 파라미터 값이 아닌 타입이 달라야함
//		System.out.println("method1#######");
//	}
	void method1(double j) {
		System.out.println("method1********");
	}
	void method1(int i, int j) {
		System.out.println("method1 int, int");
	}
	void method1(int i, double j) {
		System.out.println("method1 int, double");
	}
	void method1(double i, int j) {
		System.out.println("method1 int, double");
	}
//	void method1(double i, int j) {
//		System.out.println("method1 int, double");
//		return 3;    //리턴방식이 다르다고해서 다른 메소드가 아님
	}
}
