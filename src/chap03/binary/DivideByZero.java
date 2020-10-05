package chap03.binary;

public class DivideByZero {
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		
//		int z = x / y;
//		int z = x % y;
		
		//정수 0으로 나누면 어떤 실행문이 다음에 나와도 바로 오류로 종료됨
		//0으로 나눈 나머지도 마찬가지
		
		System.out.println("어떤 실행문....");
		
		double a = 5.0;
		double b = -0.0;
		
		double c = a / b;
		System.out.println(c);

		double c = a % b;
		System.out.println(c);
		
		// 반면에 실수 0으로 나누면 infinity가 표시됨
		// 0으로 나눈 나머지는 NaN (Not a Number)가 나옴
	}

}
