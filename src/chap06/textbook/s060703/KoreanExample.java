package chap06.textbook.s060703;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
//		Korean k3 = new Korean(); 이미 파라미터를 받는 생성자가 있어서 기본생성자가 적용되지 않음
		
		
	}

}
