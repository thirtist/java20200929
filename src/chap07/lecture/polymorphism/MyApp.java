package chap07.lecture.polymorphism;

public class MyApp {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		KindaCat k1 = t1;
//		t1 = k1;  반대로는 안됨  // 자식쪽에서 부모쪽 참조타입으로는 담을 수 있음
		k1.cry(); 
		
		
		Cat c1 = new Cat();
		c1.cry();
		KindaCat k2 = c1;
		k2.cry();
		
		
//		c1 = t1;
//		t1 = c1; // 자식 서로간에도 당연히 안됨
	}
}
