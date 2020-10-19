package chap09.textbook.s090302;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			//field1 = 10;  //인스턴스 필드와
			//method1();    //인스턴스 메소드에 접근 불가 (static 클래스 이기 때문)
			
			field2 = 10;
			method2();
		}
	}
}
