package chap06.lecture.method;

public class MyClass {
	int var1;
	int param;
	
	//메소드 : 이름이 있는 코드 블럭
	//메소드 이름 : lowerCamelCase
	//메소드 파라미터 : 코드 블럭 안에서 사용되는 값을 저장
	//					메소드 호출할 때 값 할당
	//메소드 리턴타입 : 메소드가 반환(return)해야 하는 값의 타입
	
	void myMethod(){
		System.out.println("마이 메소드 실행");
		System.out.println(var1);
	}
	
	void myMethod2(int param) {       //파라미터도 변수의 일종이라 데이터타입을 명시하고 이름을 정함
		System.out.println("마이 메소드2 실행");
		System.out.println(param);
		System.out.println(param + var1);
		System.out.println(param + this.param);
	}
	void myMethod2(int param, int param2) {
		
	}
	
}
