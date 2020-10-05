package chap02.textbook;

public class Exercises {
	public static void main(String[] args) {
		// 1번 문제
		int newVar;
		System.out.println(newVar);
		// 답 4번 -> 초기값이 저장안되면 사용할 수 없다
	
		// 2번 문제
		int modelName;
		int $value;
		int _age;
		// 답 1,4,5번  // 용어랑 앞에 숫자가 올 수 없다
		
		// 3번 문제
		// byte short,char int long
		// float double
		// boolean
		
		// 4번 문제
		int age;
		age = 10;
		double price = 3.14;
		// 타입 : int, double
		// 변수명 : age, price
		// 리터럴 : 10, 3.14
		
		// 5번 문제
		byte byteValue = 10;
		char charValue = 'A';
		
		short shortValue = charValue;
		// 답 3번 - 같은 2바이트 크기지만 저장 방법이 달라서 불가능
		
		// 6번 문제
		int intValue = 10;
		// char charValue = 'A';  자바에서는 같은 변수명을 2번 선언할 수 없어서 컴파일 에러남
		double doubleValue = 5.7;
		String strValue = "A";
		// 답 4번 기본타입과 참조타입은 형변환 불가
//		char var = (char) strValue; <-불가
		
		// 7번 문제
		char var3 = '';
		// 답 3번 문자 하나라도 들어가야함
		
		// 8번 문제
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
		byte result = byteVlaue + byteValue;
		int result = byteValue + byteValue;
		byte result2 = (byte) (byteValue + byteValue);
		//답 1번 인트타입으로 담거나 / 연산식을 바이트타입으로 형변환 해야함
	}
}
