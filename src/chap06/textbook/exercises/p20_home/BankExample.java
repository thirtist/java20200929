package chap06.textbook.exercises.p20_home;

import java.util.Scanner;

public class BankExample {
	public static Bank[] bank = new Bank[100];
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성|2.계좌확인|3.입금|4.출금|5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택번호>");

			int a = sc.nextInt();

			switch (a) {

			case 1:
				makeAccount();
				break;
			case 2:
				checkAccount();
				break;
			case 3:
				inAccount();
				break;
			case 4:
				outAccount();
				break;
			case 5:
				System.out.println("프로그램이 종료되었습니다");
				return;
			}

		}

	}

	private static void makeAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호:");
		String id = sc.next();
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("초기입금액:");
		int money = sc.nextInt();

		for (int i = 0; i < bank.length; i++) {
			Bank n = bank[i];
//			bank[i] = new Bank();
			n = new Bank();// 향상된 for
		}
		
		for (Bank n : bank) {
			if (n == null) {
				n = new Bank(id, name, money);
				System.out.println("신규계좌생성 성공");
				break;
			} else {
				System.out.println("신규계좌생성 한도 초과");
			}
		} // 여기선 향상된 for문이 안써지네

//		for (int i = 0; i < bank.length; i++) {
//			if (bank[i] == null) {
//				bank[i] = new Bank(id, name, money);
//				System.out.println("신규계좌생성 성공");
//				break;
//			} else {
//				System.out.println("신규계좌생성 한도 초과");
//			}
//		}

	}

	private static void checkAccount() {
		System.out.println("---------");
		System.out.println("계좌확인");
		System.out.println("---------");
		for (Bank n : bank) {
			if (n != null) {
				System.out.println(n.getId() + "  " + n.getName() + "  " + n.getBalance());
			}
		}

	}

	private static void inAccount() {
		System.out.print("계좌번호:");
		String id = sc.next();
		System.out.print("입금액:");
		int money = sc.nextInt();

		if (findId(id) == null) {
			System.out.println("계좌번호가 올바르지 않습니다");
			return;
		}

		int sum = findId(id).getBalance() + money;
		findId(id).setBalance(sum);
		System.out.println("입금성공");
	}

	private static void outAccount() {
		System.out.print("계좌번호:");
		String id = sc.next();
		System.out.print("출금액:");
		int money = sc.nextInt();

		if (findId(id) == null) {
			System.out.println("계좌번호가 올바르지 않습니다");
			return;
		}

		if (money > findId(id).getBalance()) {
			System.out.println("한도를 초과하여 출금할 수 없습니다");
			return;
		}

		int sum = findId(id).getBalance() - money;
		findId(id).setBalance(sum);
		System.out.println("출금성공");

	}

	private static Bank findId(String id) {
		for (int i = 0; i < bank.length; i++) {
			if (bank[i] != null && id.equals(bank[i].getId())) {
					return bank[i];
			} 
		}
		return null;
	}
}
