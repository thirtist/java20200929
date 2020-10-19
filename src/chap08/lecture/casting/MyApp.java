package chap08.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyInterface i1 = o1;
		i1.method1();
//		i1.method2();  MyClass에서만 구현된 메소드이기 때문에 실행못함
		
		MyClass o2 = (MyClass) i1;  //강제 형변환  -- 실패할 수도있음 -- 추상에서도 똑같이 사용했던 instanceof를 사용
		o2.method2(); // 이제 구현가능
		
		System.out.println(i1 instanceof MyInterface); // 형변환
		System.out.println(i1 instanceof MyClass);  //실제 타입도
	}
}
