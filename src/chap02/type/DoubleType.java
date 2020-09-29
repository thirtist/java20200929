package chap02.type;

public class DoubleType {
	public static void main(String[] args) {
		// double : 8byte
		
		double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		doubleValue = 3e6; // 3.0 * 10의 6제곱
		System.out.println(doubleValue);
		
		// 실수형 계산시 주의
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 + d2;
		System.out.println(d3);
		
		
		
		
	}
}
