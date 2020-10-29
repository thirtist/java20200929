package chap12.lecture.threadClass;

public class ThreadClassEx2 {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.start();
		t2.start();
		
		for (int i = 0; i<5; i++) {
			System.out.println((char)('Z'-i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
