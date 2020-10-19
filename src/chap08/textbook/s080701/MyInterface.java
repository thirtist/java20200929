package chap08.textbook.s080701;

public interface MyInterface {
	public void method1();
	public default void method2() {
		System.out.println("method2");
	} // 디폴트 드는 몸통이 있고 재정의가 가능
	
}
