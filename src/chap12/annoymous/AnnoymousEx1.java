package chap12.annoymous;

public class AnnoymousEx1 {
	// 상속과 인스턴스를 한꺼번에 하고 싶음 = 익명 객체생성
	public static void main(String[] args) {

		Thread t1 = new Thread() {

			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println((char) ('a' + i));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		//람다식 - 추상메소드가 하나라면 생략가능(명확해서)
		// 
		Thread t3 = new Thread(() -> {
			//여기 위에 이름이랑 여기 위치하는 run()이 생략됨
			//jvm이 위에 runnable이라고 유추가능(여러생성자가 있긴해도) 
			for (int i = 0; i < 5; i++) {
				System.out.println((char) ('Z' - i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		t3.start();
	}
}