package chap07.textbook.s070803;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); 추상화 클래스라서 객체생성불가
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); // 추상클래스라도 부모클래스의 메소드 사용가능
		smartPhone.internetSearch();
		smartPhone.turnOff(); // 추상클래스라도 부모클래스의 메소드 사용가능
	}
}
