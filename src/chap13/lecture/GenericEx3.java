package chap13.lecture;

public class GenericEx3 {
	public static void main(String[] args) {
		GenericEx3.<String>method("java");
		method("hello");   // 파라미터로 타입을 예측가능하면 생략 가능
		method(3);
		
		String s = method2();
		Integer i = method2();
	}
	
	public static <T> T method2() {
		return null;   //리턴 타입으로도 유추가 됨
	}
	
	public static <T> void method(T t) {
		System.out.println(t);
	}
}
