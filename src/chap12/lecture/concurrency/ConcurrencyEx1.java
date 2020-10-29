package chap12.lecture.concurrency;

public class ConcurrencyEx1 {
	//동시의 하나의 대상에 쓰레드를 적용할때
	static int field = 0;
 
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0; i<100_0000; i++) {
					field++;
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			};
		};
		
		t1.start();   //이거 하나만 하면 100_0000으로 정상작동
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0; i<100_0000; i++) {
					field++;
				}
				System.out.println(getName()+"종료");
				System.out.println(field);
			};
		};
		
		t2.start();  //완전 같은걸로 하면 200_0000이 나와야하는데 안나옴
	}
}
