package chap08.textbook.s080701;

public class DefaultMethodExample {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2(); //요건 재정의 안했기 때문에 인터페이스에 있는걸로 출력됨
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
		
		
	}
}
