package chap08.lecture.interfaceKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat c1 = new Cat();
		KindaCat c2 = new Tiger();
		
		KindaDog d1 = new Malamute();
		KindaDog d2 = new Wolf();
		
		c1.cry();
		c2.cry();
		
		d1.bark();
		d2.bark();
		
		Pet p1 = new Cat();
		Pet p2 = new Malamute();
		
		p1.sit();
		p2.sit();
		
//		Malamute cat1 = (Malamute)p1; // 얘는 강제형변환이 안됨. 문법오류는아님
		Cat cat1 = (Cat) p1;
		Malamute mall = (Malamute)p2;
		
		System.out.println(p1 instanceof Cat);
		System.out.println(p1 instanceof KindaCat);
		System.out.println(p1 instanceof Pet);
	}
	
	public static void method(Pet p) {
		
	}
	
}
