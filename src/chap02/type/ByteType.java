package chap02.type;

public class ByteType {
	public static void main(String[] args) {
		// byte : 정수형
		// 크기 : 1byte (8bit)
		
		
		//-128: 1000 0000
		//    :
		// -2 : 1111 1110
		// -1 : 1111 1111 => +1을 더하면 0이 나와야 하므로 1 0000 0000 에서 앞에 1이 버려짐
		
		// +1
		
		// 0 : 0000 0000
		// 1 : 0000 0001
		// 2 : 0000 0010
		//   :
		// 127 : 0111 1111
		
		// -128 : 1000 0000   오버플로 되면 순환 (127 다음은 -128
		
		byte byteValue;
		
		byteValue = 0;
		System.out.println(byteValue);
		
		byteValue = 127;
		System.out.println(byteValue);
		
//		byteValue = 128;   <-오류
//		System.out.println(byteValue);
		
		byteValue++;
		System.out.println(byteValue);
		
	}
}
