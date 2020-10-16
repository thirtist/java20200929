package chap07.textbook.exercises.p05;

public class Child extends Parent {
	private int studentNo;

	public Child(String name, int studentNo) {
		super(name); // this.name = name; => 부모클래스에 접근할 때는 this()를 써야함
		this.studentNo = studentNo;
	}
	
	
}
