package chap04.textbook;

public class SwitchCharExample {
	public static void main(String[] args) {
		int ran = (int) (Math.random()*3);
		char grade = (char) ('a'+ran);
		
		System.out.println("등급" + grade);
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
	}

}
