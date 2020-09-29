package chap02.variable;

public class Variable {
	public static void main(String[] args) {
		// javascript
//		var myVar;
//		myVar = 30;
//		myVar = "hello";
		
		// java 변수를 선언할 때 타입을 결정해줘야함.
		// 변수의 선언
		int myVar; 
		myVar = 3; // 값을 처음에 줘야 나중에 사용가능 = 초기화
//		myVar = "hello"; // 얘는 선언했던 인트형식이 아니라서 못 넣음(오류)
		
		System.out.println(myVar);
		
		int myVar2 = 5; 
		// 선언과 값을 동시에 할 수 있음
		System.out.println(myVar2);
		
	}

}
