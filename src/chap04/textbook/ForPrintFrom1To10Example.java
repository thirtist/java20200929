package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {

		// 1->2->code->3->2
		// 2번은 boolean 타입이어야함(조건에 안맞을 때 빠져 나가야 하기 때문)

		// 1~10
		System.out.println("----1~10----");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 11~20
		System.out.println("----11~20----");
		
		for (int i= 11; i<=20; i++) {
			System.out.println(i);
		}
		
		// 1~9 홀수만
		System.out.println("----1~9 홀수만----");
		
		for (int i= 1; i<=9; i+=2) {
			System.out.println(i);
		}
		
		// 10~1
		System.out.println("----10~1----");
		
		for (int i= 10; i>=1; i--) {
			System.out.println(i);
		}
		
		// 10~2 짝수만
		System.out.println("----10~2 짝수만----");
		
		for (int i= 10; i>=2; i-=2) {
			System.out.println(i);
		}
		
	}
}
