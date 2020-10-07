package chap04.textbook;

import java.util.Scanner;

public class DoWhileExampleScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력");
		
		String line = scanner.nextLine(); // 스캐너 클래스 .nextLine() 메소드 : 엔터가 발견될때 까지 읽는 메소드
		
		System.out.println("출력");
		System.out.println(line);
		
	}

}
