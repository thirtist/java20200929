package chap14.lecture.nested;

public class NestedEx2 {
	private int outterField;
	
	public void method() {
		MyInterface i1 = () -> {
			int outterField = 3;
			System.out.println("익명 클래스의 객체 (local class)");
			System.out.println(this);
			System.out.println(outterField);
			System.out.println(NestedEx2.this.outterField);
			System.out.println(this.outterField); //이거도 되는데 위에는 클래스이름까지써줌
		};
		
		i1.method(); //그 인터페이스내의 함수이름을 알아야지 호출함...(생략은했는데 이름몰라도되는건아니구나)
		
	}
	
	public static void main(String[] args) {
		
		
		NestedEx2 a = new NestedEx2();
//		
		a.method();
	}
}
