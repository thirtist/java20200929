package chap10.textbook.s100701;

public class AccountExample {
	public static void main(String[] args) {
		Account account =new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액:" + account.getBalance());
		//출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
//			e.printStackTrace();   중요 - 이게 없으면 예외발생이 어디서 됐는지 모름(떠넘겨서 그냥 해결되어버리니)
		}
	}
}
