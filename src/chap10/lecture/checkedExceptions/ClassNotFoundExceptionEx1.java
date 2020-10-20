package chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("프로그램 실행1");

		try {
			System.out.println("프로그램 실행 try1");
			
			Class.forName("java.lang.String2");//이름이 있는지확인		//만약 여기서 예외가 발생하면 바로 catch문으로 넘어감
																		//아래 try2가 실행이 안됨
			System.out.println("프로그램 실행 try2");
			
		} catch (ClassNotFoundException e) {
			System.out.println("익셉션발생!!!!!");
		} finally {
			System.out.println("무조건 실행");
		}

		System.out.println("프로그램 실행2");
	}
}
