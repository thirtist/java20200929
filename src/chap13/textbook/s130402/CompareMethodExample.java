package chap13.textbook.s130402;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1,"사과");
		boolean result1 = Util.<Integer, String>compare(p1,p2);
		if(result1 ) {
			System.out.println("논리적으로 동등한 객체입니다");
		} else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
		Pair<String, String> p3 = new Pair<String, String>("user1","홍길동");  
		Pair<String, String> p4 = new Pair<String, String>("user2","홍길동");
		boolean result2 = Util.compare(p3,p4);    //위랑다르게 앞에 <>를 생략함//위에 둘다 string으로유추가능
		if(result2 ) {
			System.out.println("논리적으로 동등한 객체입니다");
		} else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
	}
}
