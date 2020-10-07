package chap04.exercises;

public class Exercise04 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		
		do {
		a = (int) (Math.random() * 6 + 1);
		b = (int) (Math.random() * 6 + 1);

		System.out.println("(" + a + "," + b + ")");
		
		} while (!(a + b == 5));
		
		

	}

}
