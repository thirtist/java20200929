package chap10.textbook.s100301;

public class TryCatchFianllyExample {
	public static void main(String[] args) {
		try {
			Class claszz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
	}
}
