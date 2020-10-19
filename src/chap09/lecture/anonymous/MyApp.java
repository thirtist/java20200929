package chap09.lecture.anonymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		Parent p2 = new Parent() {
			@Override
			public void method1() {
				System.out.println("오버라이딩");
			}
		};
		p2.method1();
		
//		Parent p3 = new Parent(); // Parent가 추상클래스면 이게 안되니까
		Parent p3 = new Parent() {
			
		};
	}
}
