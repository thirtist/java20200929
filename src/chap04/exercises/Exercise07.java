package chap04.exercises;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------");
			System.out.print("선택> ");

			String num = scanner.nextLine();
			int numA = Integer.valueOf(num);

			if (numA == 1) {
				System.out.print("예금액> ");
				String moneyStr1 = scanner.nextLine();     //string을 새로만들어도 되긴하지만 아래 2번처럼 이미 있던 num을 재활용해도 되긴함
				int moneyA = Integer.valueOf(moneyStr1);   
				balance += moneyA;
			}

			if (numA == 2) {
				System.out.print("출금액> ");
				num = scanner.nextLine();
				int moneyA = Integer.valueOf(num);
				balance -= moneyA;
			}

			if (numA == 3) {
//				System.out.print("잔고> ");
//				System.out.println(balance);   // 이거 한꺼번에
				System.out.print("잔고>" + balance);
			}

			if (numA == 4) {
				run = false; // break; 라도 써도됨
			}
			
			// 같은지만 비교하는거면 switch(+case+break)문으로 하는게 간편
			
		}

		System.out.println("프로그램 종료");
	}

}
