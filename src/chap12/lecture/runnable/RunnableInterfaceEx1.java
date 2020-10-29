package chap12.lecture.runnable;

public class RunnableInterfaceEx1 {
	public static void main(String[] args) {
		
	Thread t1 = new Thread(new Runnable1());
	Thread t2 = new Thread(new Runnable2());
	
	t1.start();
	t2.start();
	}
}
