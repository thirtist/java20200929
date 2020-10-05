package chap03.textbook;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2_000_000_000, 2_000_000_000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
			//예외처리코드
		}
	}
	// 10장에서 배움
	// try catch구문은 try안에것을 실행해보고 catch를 실행할 수도 있고 안할 수도있음
	// 자바는 함수를 항상 메소드라고 부름
	
	
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생"); //예외발생코드
			}
		} else { // right<=0 일경우
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생"); //예외발생코드
			}
		}
		return left + right;
		
	}
}
