package chap06.lecture.packageKeyword;

import java.util.Scanner;
import java.util.*;

public class MyClass {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1 = new chap06.lecture.packageKeyword.MyClass();
		// 패키지 주소로 클래스를 불러옴

		MyClass o2 = new MyClass();
		// 같은 패키지 내에 있으면 이렇게 만듦
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		Scanner s2 = new Scanner(System.in);
//		(자동으로 필요한 패캐지 임포트 ctrl + shift + o)
		
		java.lang.String str = "java";
		String str2 = "css";
		
		
	}
}
