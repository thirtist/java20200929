package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		// ~반전(단항)
		int i = 10;
		int j = ~i;
		System.out.println(j);
		
		// 이항
		// & and : 같은 자리의 bit가 1인 경우만 1, 나머지 0
		// | or
		// ^ xor
		
		// 피연산자 : integer
		// 결과 : integer
		
		int a = 45;
		int b = 25;
		int c = a & b;
		System.out.println(c);
		
		c = a | b;
		System.out.println(c);
		
		c = a ^ b;
		System.out.println(c);
		
		//bit shift 연산자
		//<< : 각 bit를 왼쪽으로 옮김
		//>> : 각 bit를 오른쪽으로 옮김
		//>>>
		
		int val = 456789;
		int res = val <<1;
		System.out.println(res);
		
		val = 98;
		res = val >> 2;
		System.out.println(res);
		
		val = -13;
		res = val >>2;
		System.out.println(res);

		val = 98;
		res = val >>>2;
		System.out.println(res);

		val = -17;
		res = val >>>1;
		System.out.println(res);
		
	}

}
