package chap07.textbook.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child(); // 부모클래스로 자동 형변환 된 자식인스턴스가
		method1(parentA);			  // 자식으로 다시 형변환 당연히됨
		method2(parentA);
		
		Parent parentB = new Parent(); // 부모클래스의 부모인스턴스가
		method1(parentB);			   // 자식클래스로 변환 안됨
		method2(parentB);			   // method2는 변환안전장치인 instanceof가 없음
		
		
	}
	
}
