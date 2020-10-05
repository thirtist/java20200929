package chap03.binary;

public class LoacalOperator {
	public static void main(String[] args) {
		// 논리연산자
		// && & and
		// || | or
		// ^ xor ( exclusive or 배타적 논리합)
		
		
		System.out.println("=== and ===");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("=== or ===");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("=== xor ===");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("=== &| ===");
		int a = 3;
		System.out.println(false & false);
		System.out.println(false & true);
		System.out.println((a<0) & (a++ <0));  // 앞에거 판단한거만 따라가지만 결과적으로 뒤에것도 판단은함
		System.out.println(a);				   // a가 늘어나있음(위에서 판단했단 소리)

		System.out.println("=== &&|| ===");
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println((a<0) && (a++ <0)); // and일때는 앞에가 false면 뒤에를 아예 판단 안해버림
		System.out.println(a);				   // 그래서 a가 안들어나있음 (아예판단 안해서++적용안됨)
	}
}
