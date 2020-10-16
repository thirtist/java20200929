package chap06.textbook.s061004;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다");
	}
	
//	교재 외 내용
	static int speed2;
//	
	
	public static void main(String[] args) {
		
//		speed = 60; 클래스 멤버는 인스턴스 멤버에 바로 접근불가
		
		Car myCar = new Car(); //그래서 객체를 생성해서 접근
		myCar.speed = 60; //객체에 접근할 때는 이런식으로
		myCar.run();
		
		Math.random(); // 객체를 생성하지 않아도 쓸 수 있었든 클래스 메소드
		Math.abs(-3);
		
//		교재 외 내용
		speed2 = 100; //클래스 멤버끼리는 바로 접근가능
		System.out.println(speed2);
		Car.speed2 = 200; // 클래스멤버에 접근할때 이것도 동일한 방법
		System.out.println(speed2);
	}
	
}
