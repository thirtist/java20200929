package chap09.lecture.nestedClass;

public class MyClass {

	class Class1 {
		int i;
//		static int j; // 인스턴스 내부 클래스는 스태틱멤버를 가질 수 없다

		Class1() {

		}

		Class1(int i) {

		}

		void method() {

		}
	}

	static class Class2 {
		int i;
		static int j;   //반면에 스태틱 클래스는 내부에 클래스멤버를 가질 수 있다.
		
		void method() {

		}

		Class2() {

		}

		Class2(int i) {

		}
	}
}
