package chap06.lecture.accessModifier;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		
		System.out.println(o1.var1); // 퍼블릭이라서 모든 외부에서 사용가능
		System.out.println(o1.var2); // 디볼트라서 패키지내에있는거 사용가능
//		System.out.println(o1.var3); private로 선언해서 같은 패키지 내에있는거라도 사용불가
	}
}
