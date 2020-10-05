package chap03.textbook;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		// 정수 계산을 먼저 시킨 후에
		
		double result = temp/10.0;
		// 10으로 나눠서 해결함 // 꼭 이렇게 해결하는건 아님 회사마다 다름
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result + "조각이 남는다");
	}

}
