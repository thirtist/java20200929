package chap02.textbook;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;  // 자동변환
		num2 = (int) num3;  // 강제변환
		
		int result = num1 - num2;  // Double 의 지수부분이 52bit라서 int의 32bit가 다 담아짐 = 문제없음
		System.out.println(result);
	}
}
