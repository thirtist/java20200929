package chap10.textbook.excercises.p07;

public class AbMy {

	
	class A {
		String message;
		
		public A(String message) {
			this.message = message;
		}
	}
	
	class B extends A{
		public B(String message) {
			super(message);
		}
	}
}
