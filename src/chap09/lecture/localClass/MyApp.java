package chap09.lecture.localClass;

public class MyApp {
	public static void main(String[] args) {
		int i =3;
		System.out.println(i);
		
		
		//메소드 안에 있는 클래스 = 로컬 클래스
		class LocalClass {
			int i;
//			static int j;  클래스멤버를 생성못함
			
			void method() {}
//			static void method2() {}
		}
		
		LocalClass l1 = new LocalClass();
		//객체 생성 자체는 여기 내에서 밖에 못함
	}
}
