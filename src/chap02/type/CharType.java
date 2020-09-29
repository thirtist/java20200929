package chap02.type;

public class CharType {
	public static void main(String[] args) {
		// char : 2byte  -> short 타입과 같은 크기
//		                 -> char는 문자니까 음수를 표현할 필요가 없음
		// 작은 따옴표를 이용해 하나의 문자를 표현
		
		char charValue;
		charValue = 'a';
		System.out.println(charValue);
		
//		charValue = 'ab';   문자2개를 못넣으니 컴파일 에러
//		charValue = '';    빈문자도 갖을 수 없음 컴파일 에러
		charValue = ' ';   //스페이스는 문자취급으로 가능
		
	    charValue = 44032;  //16비트로 갖을 수 있는 값을 가질 수 있음
	    System.out.println(charValue);
	    
	    charValue = '나';
	    System.out.println(charValue);

	    charValue = '\uac00';
	    System.out.println(charValue);
	    
	    
	    
	}
}
