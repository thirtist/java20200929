package chap07.lecture.superConstructor;

public class ChildClass extends ParentClass {
	public ChildClass() {
		super(1); // 이게 숨겨져있었음 // 근데 왜 아규먼트 받았다고 오류안나지
	}

	@Override
	void method1() {
		super.method1();
		System.out.println("child method1");
	}

}
