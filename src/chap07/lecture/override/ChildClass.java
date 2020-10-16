package chap07.lecture.override;

public class ChildClass extends ParentClass{
	int var2;
	
	void method2() {
		System.out.println("child method");
	}
	@Override
	void method1() {
		System.out.println("child method1111");
	}
}
