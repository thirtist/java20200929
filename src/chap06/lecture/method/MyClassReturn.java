package chap06.lecture.method;

public class MyClassReturn {
	int var1;
	
	void method1() {
		System.out.println("메소드1 실행");
	}
	
	int method2() {
		System.out.println("메소드2 실행");
		
		//return : 메소드 종료, 오른쪽에 있는 값을 호출한 곳으로 돌려줌
		return var1*2;
		System.out.println("실행");
	}

}
