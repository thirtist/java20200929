package chap06.textbook.exercises.p20_2;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		String ano;
		String owner;
		int money;

		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("계좌주: ");
		owner = scanner.next();
		System.out.print("초기금액: ");
		money = scanner.nextInt();

		Account account = new Account(ano, owner, money);
		for (int i = 0; i < accountArray.length; i++) {
			if ((accountArray[i] == null)) {
				accountArray[i] = account;
				break;
			}
		}
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		
		for (int i = 0; i < accountArray.length; i++) {
			if (!(accountArray[i] == null)) {
				System.out.println(accountArray[i].getAno() +"  "+ accountArray[i].getOwner() +"  "+ accountArray[i].getBalance());
			}
		}

	}

	// 예금하기
	private static void deposit() {
		String ano;
		int money;		
		
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("예금액: ");
		money = scanner.nextInt();
		
		if(findAccount(ano)==null) {
			System.out.println("등록되지 않은 계좌번호입니다");
			return;
		}
		
		int sum = findAccount(ano).getBalance() + money;
		findAccount(ano).setBalance(sum);
		
		System.out.println("예금이 성공되었습니다 ");
	}

	// 출금하기
	private static void withdraw() {
		String ano;
		int money;		
		
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("출금액: ");
		money = scanner.nextInt();
		
		if(findAccount(ano)==null) {
			System.out.println("등록되지 않은 계좌번호입니다");
			return;
		}
		
		int sum = findAccount(ano).getBalance() + money;
		findAccount(ano).setBalance(sum);
		
		System.out.println("출금이 성공되었습니다 ");
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (!(accountArray[i] == null) && accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
		
	}
}
