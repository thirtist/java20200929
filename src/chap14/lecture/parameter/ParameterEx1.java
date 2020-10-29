package chap14.lecture.parameter;

public class ParameterEx1 {
	public static void main(String[] args) {
		MyInterface1 o1 = (int i)->System.out.println(i);
		o1.method(9);

		MyInterface1 o2 = (i) -> System.out.println(i);
		o2.method(3);
		//매개변수 안의 형식마저도 생략가능(인터페이스에 명시되어 있어서 유추가능하므로)
		
		MyInterface1 o3 = i -> System.out.println(i);
		o3.method(10);
		//파라미터가 하나면 안의 둥근괄호도 생략가능
	}
	
}
