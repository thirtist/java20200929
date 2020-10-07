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
				num = scanner.nextLine();
				int moneyA = Integer.valueOf(num);
				balance += moneyA;
			}

			if (numA == 2) {
				System.out.print("출금액> ");
				num = scanner.nextLine();
				int moneyA = Integer.valueOf(num);
				balance -= moneyA;
			}

			if (numA == 3) {
				System.out.print("잔고> ");
				System.out.println(balance);
			}

			if (numA == 4) {
				break;
			}
		}

		System.out.println("프로그램 종료");
	}

}
