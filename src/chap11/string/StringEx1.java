package chap11.string;

public class StringEx1 {
	public static void main(String[] args) {
		String str1 = "java";
		char c1 = str1.charAt(0);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
//		System.out.println(str1.charAt(4)); 없어서 프로그램 오류 종료됨

		// equals
		String str2 = "python";

		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		

		System.out.println(str2);
		System.out.println(str6);
		System.out.println(str2 == str6); // 참조타입은 번지값을 비교해서 다르다고 나옴
		System.out.println(str2.equals(str6)); // 순수 문자열만 비교
		
		// indexOf
		String str = "자바 프로그래밍";
		System.out.println(str.indexOf("프로")); // 0부터시작해서 몇번째 있는지
		// 중복일 경우 맨 첫번째 꺼를 나타냄 // -1이 리턴되면 존재하지 않음
		
		// length
		String str8 = "이것이 자바다.    java";
		int l = str8.length();
		System.out.println(l);
		System.out.println(str8.charAt(l - 1));
		
		// replace
		String str9 = "abcdefbacdefg";
		String str10 = str9.replace("abc", "123");
		System.out.println(str10);
		System.out.println(str9);
		
		// substring
		String str11 = "0123456789";
		String sub = str11.substring(2,3);
		System.out.println(sub);
		sub = str11.substring(5, str11.length());
		System.out.println(sub);
		
		sub = str11.substring(6);
		System.out.println(sub);
		
		// trim
		
		String str12 = " java ";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
		
	}
}
