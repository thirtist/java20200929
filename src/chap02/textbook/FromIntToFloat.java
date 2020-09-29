package chap02.textbook;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;  // 자동변환
		num2 = (int) num3;  // 강제변환
		
		int result = num1 - num2;  // float의 지수부분이 23bit라서 int의 32bit를 다 담을 수 없음
		System.out.println(result);
	}
}
