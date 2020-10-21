package chap05.lecture;

public class ReferenceType2 {
	public static void main(String[] args) {
		int i = 30;
		int j = i;
		
		String str1 = "java";
		String str2 = str1;
		
		System.out.println(i == j);
		System.out.println(str1 == str2);
		
	}
}
