package chap06.textbook.exercises.p20_home;

public class Bank {
	//인스턴스 필드
		private String id;
		private String name;
		private int balance;
		
		//인스턴트 생성자
		public Bank(String id, String name, int balance) {
			this.id = id;
			this.name = name;
			this.balance = balance;
		}

		//인스턴트 필드  getter setter
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
}
