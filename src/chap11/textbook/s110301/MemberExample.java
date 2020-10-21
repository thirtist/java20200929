package chap11.textbook.s110301;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		//원래 String 객체에서는 새객체를 생성하더라도 equals()로 비교하면 문자열만 비교해서 같은 문자열인지 비교 가능했었음
		//     String에서는 새 객체를 생성할때 .hashCode()를 오버라이드해서 해쉬값을 같게 만들어주기 때문
		//그런데 다른 클래스에서는 일단 다른 객체를 생성하면 해쉬값이 다르게됨
		//그래서 equals를 쓰려면 일단 해쉬값을 같게 만들어줘야할 필요성이 있음
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}
}
