package chap09.textbook.s090301;

public class A {
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B Var1  = new B();
		C var2 = new C();
	}
	
	//정적필드 초기화
	//static B field3 = new B(); 클래스에서 객체로 접근 불가
	static C field4 = new C();
	
	//정적메소드
	static void method2() {
		//B var1 = new B();  //클래스멤버에서 객체로 접근불가
		C var2 = new C();
	}
	
	//인스턴스 멤버 클래스
	class B {}
	//정적 멤버 클래스
	static class C{}
}
