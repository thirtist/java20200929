package chap05.exercises;

import java.util.Scanner;

public class Exercise09Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		String str = scanner.nextLine();
		int val = Integer.valueOf(str);
		
		System.out.println("출력");
		System.out.println(str);
		System.out.println(val);
		
		System.out.println("정수입력>");
		val = scanner.nextInt();
		
		System.out.println("정수출력>");
		System.out.println(val);
		
	}

}
