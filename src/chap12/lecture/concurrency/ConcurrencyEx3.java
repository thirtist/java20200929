package chap12.lecture.concurrency;

public class ConcurrencyEx3 {
	static int field = 0;
	static final Object lock = new Object();

	public static void inc() {
		synchronized (lock) { //메소드 안에서의 일부분만 동시에 쓰기 금지를 하고 싶을 때
			field++; // 이 것을 실행하기 위해서는 (lock)객체를 획득해야함(안에객체는 의미있는 객체가 아니어도됨=아무객체)
		} // 획득하기 전 까지는 실행을 못시킴
	}

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//						field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};

		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//						field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};

		t2.start();
	}
}
