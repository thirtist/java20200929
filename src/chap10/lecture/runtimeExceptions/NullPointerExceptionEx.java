package chap10.lecture.runtimeExceptions;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		int[] a = null;
		
		System.out.println(a.length);
	}
}
