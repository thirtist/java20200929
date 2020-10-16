package chap06.lecture.method;

public class MyAppReturn {
	public static void main(String[] args) {
		MyClassReturn o1= new MyClassReturn();
		o1.method1();
		o1.method2(); // 리턴값을 출력하는 명령어가 없기때문에 그냥 간직하고만 있음
		int v = o1.method2();
		
		System.out.println(v); //변수에 넣어서 출력하니까 리턴값도 출력이됨
	}
}
