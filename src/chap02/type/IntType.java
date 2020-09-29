package chap02.type;

public class IntType {
	public static void main(String[] args) {
		// int : 4byte (32bit)
		// 최대 : ‭2147483647 (21억쯤)
		// 최소 : -‭2147483648
		
		int intValue = 2147483647;
		System.out.println(intValue);

		intValue++;
		System.out.println(intValue); // 넘어서 오류남
		
	    intValue = -2147483648;
	    System.out.println(intValue);
		
		// 정수 리터럴
//		intValue = 2147483648;   정수 리터럴 표현자체가 오류남
		intValue = 2_147_483_647;  // 100단위로 끊어서 쓸 수도 있음
		intValue = 0177777777;     // 0으로 시작하면 8진법
		intValue = 0x7FFFFFFF;    // 0x으로 시작하면 16진법
	
	}
}
