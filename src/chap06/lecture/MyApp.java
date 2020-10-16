package chap06.lecture;

public class MyApp {
	public static void main(String[] args) {
		int i = 3;
		
//		Car car = {name: 'kia', model: 'k5'}; //js에서는 그냥 만들었지만
											  //java에서는 설계도가 있어야함
		
//		Car car = new Car();    //인스턴스 Car()가 클래스(설계도)에 의해서 만들어짐
//		Car car2 = new Car();   //아직 Car() 클래스가 없어서 오류
								//클래스 이름 = 변수타입이름
		
		MyClass c = new MyClass();
		MyClass d = new MyClass();
		
		//클래서 만드는법 Public class 이름 {}
		
	}
}
