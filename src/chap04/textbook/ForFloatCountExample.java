package chap04.textbook;

public class ForFloatCountExample {
	public static void main(String[] args) {
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
		//실수를 for문으로 반복하는것은 안전하지 않다(근사값으로 저장되기 때문)
	}

}
