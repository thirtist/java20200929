package chap05.lecture;

public class ReferenceType3 {
	public static void main(String[] args) {
		int i = 30;
		int j = 30;

		String str1 = "java";
		String str2 = "java";

		System.out.println(i == j);
		System.out.println(str1 == str2);
	}
}