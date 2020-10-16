package chap07.lecture.superKeyword;

public class ChildClass extends ParentClass {
	@Override
	void method1() {
		System.out.println("child method1");
		super.method1();
	}
}
