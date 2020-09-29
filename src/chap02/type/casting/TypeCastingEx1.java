package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primitive type 8개
		
		// 1byte    2byte   4byte    8byte
		// boolean  char
		// byte     short   int     long
		//                  float   double
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		// 자동 형변환
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		// 강제 형변환
		longValue = 3333;
//		intValue = longValue; // 형변환 에러 // 컴파일오류
		intValue = (int) longValue; // 앞에 키워드를 입력해서 변환시켜줘야함
		System.out.println(intValue);
		
		// 자동형변환 (정수->실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue; // 여기서는 float이 지수부분이 23bit이므로 int의 32bit를 모두 못담음
		
		floatValue = longValue;// float이 바이트는 더 작지만 더 큰수를 표현 할 수 있어서 변환이 되지만
							   // 마찬가지로 잃어버릴 수 있음(지수부분23bit)
		doubleValue = longValue; // 이거도 마찬가지로 double이 52bit이므로 long의 64bit를 담는데 손실있을 수 있음
		
		
		
		
	}
}
