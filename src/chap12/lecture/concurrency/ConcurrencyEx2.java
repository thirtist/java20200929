package chap12.lecture.concurrency;

public class ConcurrencyEx2 {
	// 멀티 쓰레드에서 같은 대상에게 쓸 때의 해결책
	// 필드를 바로 접촉하지 않고 메소드로 감싸고 그 메소드에의 접근을 막음 (이미 점유하고있으면 기다려야함)
	// 메소드에 synchronized를 붙이면 됨 (완벽한 해결책은 아님)
	static int field = 0;

	public synchronized static void inc() {
		field++;
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//					field++;
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
//					field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};

		t2.start();
	}
}