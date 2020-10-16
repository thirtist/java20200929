package chap07.textbook.exercises.p06;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		// Child()로 객체생성 및 생성자 실행
		// 어떤 Child 내의 생성자가 실행 되더라도 일단 안보이는 super()가 실행됨
		// super() 때문에 부모클래스에서 생성자 Parent()가 실행됨
		// Parent()안에서 this가 실행돼서 Parent의 nation을 대한민국으로 바꾸고
		   //"Parent(String nation) call"이 출력됨
		   //이어서 "Parent() call"이 출력됨
		// this()키워드로 인해서 아래 생성자를호출해서 child 필드 name에 홍길동들어감
		   // "child(String name) call"이 출력됨
		   // "Child() Call"이 출력됨
	}
}
