package chap12.lecture.name;

public class NameEx1 {
	public static void main(String[] args) {
		Thread th0 = Thread.currentThread();  //현재 실행되는 쓰레드의 정보를 얻음
		System.out.println(th0.getName());   //쓰레드의 이름얻기
		th0.setName("my Main Thread");       //쓰레드의 이름바꾸기
		System.out.println(th0.getName());
		
		Thread t1 = new Thread() {
			public void run() {
				System.out.println(this.getName());  //익명쓰레드를 만들면 자동으로 Thread-0이라고나옴
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(this.getName());  // 그 다음은 Thread-1이라고나옴
			}			 		//일부러 늦게시작하지 않는이상 t1 t2중 누가먼저 실행될지는 모름
		};
		t2.start();
		
		//누가 우선순위를 갖을지 정할 수 있음
		
		
	}
}
