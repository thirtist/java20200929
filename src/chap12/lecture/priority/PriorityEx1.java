package chap12.lecture.priority;

public class PriorityEx1 {
	public static void main(String[] args) {
		Thread[] threads = new Thread[20];

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread() {
				public void run() {
					for (int i = 0; i < 20_0000_0000; i++) {
					} // 연산내용할애
					System.out.println(getName() + "완료");
				};
			};
//			threads[i].setPriority(10); //cpu 차지 우선순위 1~10 10에 가까울수록 높음 기본값은 5
										//cpu 차지는 확률이라서 반드시 먼저 실행되는것은 아님

			if (i > 10) {
				threads[i].setPriority(10);  
			} else {
				threads[i].setPriority(1);
			}
		}

		for (Thread t : threads) {
			t.start();
		}
	}
}
