package chap14.lecture.parameter;

public class ParameterEx2 {
	public static void main(String[] args) {
		
		MyInterface2 o1 = (int a, int b) -> System.out.println(a+b);
		o1.method(3, 10);
		
		MyInterface2 o2 = (a, b) -> System.out.println(a+b);
		o2.method(15, 5);  //역시 파라미터 타입까지는 생략가능
		
//		MyInterface2 o3 = a, b -> System.out.println(a+b); 이거는 안됨
		//파라미터가 하나일때만 ()생략가능
		
	}
}
