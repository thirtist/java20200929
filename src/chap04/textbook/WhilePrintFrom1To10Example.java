package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {

		System.out.println("====1~10====");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("====11~20====");
		i = 11; // 다시 i를 사용하려고 값을 그냥 넣어버림
		while (i <= 20) {
			System.out.println(i);
			i++;
		}

		System.out.println("====1~9 홀수만====");
		int z = 1;
		while (z <= 9) {
			System.out.println(z);
			z += 2;
		}
		
		System.out.println("====10~1====");
		int k = 10;
		while (k >= 1) {
			System.out.println(k);
			k--;
		}
		
		System.out.println("====10~2 짝수만====");
		int l = 10;
		while (l >= 1) {
			System.out.println(l);
			l -= 2;
		}

	}

}
