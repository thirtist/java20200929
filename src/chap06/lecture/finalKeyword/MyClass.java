package chap06.lecture.finalKeyword;

public class MyClass {
	int filed1;
	final int filed2; // 상수라서 꼭 값을 할당 해줘야함
	
	final static int field3 = 20; //이런식으로 바로 할당해도되나
	final static int field4; 
	//파이같은 변하지 않는 상수를 final static으로 저장해놓음
	// 대문자로 생성하는게 관습
	
	public MyClass() {
		filed2 = 30;  // 생성자는 객체가 생성될 때 처음 실행되므로 값을 할당
	}
	
	static {
		field4 = 40;  //이런식으로 static에서 할당해줘도됨
	}
}
