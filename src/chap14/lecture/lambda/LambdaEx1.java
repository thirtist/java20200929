package chap14.lecture.lambda;

public class LambdaEx1 {
	//자바 8부터 적용(거의 최근) 하지만 다른 프로그램에는 예전부터 있었음
	public static void main(String[] args) {
		//람다식의조건
		//추상메소드가 하나인 인터페이스의(보통 인터페이스) 객체를 만들 때
		//메소드 본체만 작성하는 문법
		
		MyInterface o1 = new MyInterface() {
			@Override
			public void method() {
				System.out.println("추상메소드 재정의");
			}
		};
		
		MyInterface o2 = ()->System.out.println("추상메소드 재정의2");
		//하나만 있으니 메소드이름을 안적어도됨 (유추가능)
		//객체를 만들 때니까 (new 인터페이스 이름)도 없어도됨
		//추상메소드의 내용이 한줄이 아닐때는 {}를 열어서 담아야함(if에서 {}랑 같음)
		
		o1.method();
		o2.method();
		
	}
}
