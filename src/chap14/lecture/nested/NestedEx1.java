package chap14.lecture.nested;

public class NestedEx1 {
	public static void main(String[] args) {
		final int i = 0;

		MyInterface i1 = () -> System.out.println("실행");

		MyInterface i2 = new MyInterface() {
			public void method() {
				System.out.println("실행2");
			}; // 로컬클래스(메소드안의 클래스)
				// 지역변수를 써야할 때 꼭 파이널이어야 했었음
		};
	}
}
