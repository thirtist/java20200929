package chap06.textbook.exercises.p19;

public class Account {

	private int balance;
	
//	static final int MIN_BALANCE = 0;
//	static final int MAX_BALANCE = 1000000;
//	선생님은 상수선언했음
	
	
	public void setBalance(int balance) {
		if(balance > 0 && balance < 1000000) {
			this.balance = balance;
		}
	}

	public int getBalance() {
		return balance;
	}

}
