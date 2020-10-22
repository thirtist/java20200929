package chap13.lecture;

public class GenericEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.method1();
		o1.method2(new Object());
		o1.method2("java");
		o1.method2(300);

		
		MyClass<String> o2 = new MyClass<String>();  //이때 타입이 정해짐
//		MyClass<String> o2 = new MyClass<>();  //뒤의 <>는 생략가능-컴파일러가 알아서 추측함
		o2.method1();
		o2.method2("java");
//		o2.method2(new Object());  //새 Object 객체는 는 위에 제너릭에서 결정한 타입이 아니므로 넣을 수 없음
		
		MyClass<Integer> o3 = new MyClass<Integer>();
		o3.method2(100);  //자동 boxing돼서 들어감
//		o3.method2("java"); //안됨
	}
}
