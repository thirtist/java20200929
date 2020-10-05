package chap02.type.casting;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
//		int intValue2 = intValue + longValue; 연산에서 작은타입으로 담을 수 없음(오류남)
		long longValue2 = intValue + longValue;
		
		double doubleValue = 3.14;
		
//		int intValue3 = intValue + doubleValue; 마찬가지로 결과가 실수라서 인트타입으로 담을 수 없음
		double doubleValue2 = intValue + doubleValue;
		
		// 정수형의 연산결과는 int -> 중요
		short shortValue1 = 3;
		short shortValue2 = 5;
		
		short shortValue3 = shortValue1 + shortValue2;
		int intValue4 = shortValue1 + shortValue2;
		
	}
}
