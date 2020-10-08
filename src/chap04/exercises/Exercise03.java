package chap04.exercises;

public class Exercise03 {
	public static void main(String[] args) {

		int sum3 = 0;
		for (int i = 0; i <= 100; i += 3) {
			sum3 += i;
		};

//		for (int i = 0; i <= 100; i ++) {
//			if (i % 3 == 0) {	
//				sum3 += i;
//			}
//		}; 이렇게 해도 됨

		System.out.println("3의 배수의 합: " + sum3);
	}

}
