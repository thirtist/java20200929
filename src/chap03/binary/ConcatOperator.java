package chap03.binary;

public class ConcatOperator {
	public static void main(String[] args) {
		// 연결연산자 concatenate
		int a = 3;
		int b = 5;
		int c = a + b;
		
		String s = "9";
		String d = a + s; //String과 정수가 연산되면 String타입이라서 int에는 못담음
		
		System.out.println(d); //따러서 + 가 이항연산자 역할을 하는 것이 아니고 연결연산자로 적용됨
		
		String e = a + b + s ;
		System.out.println(e); //+연산은 왼쪽에서부터 이루어져서 a + b 이후에 연결연산자가 적용됨
		
		String e = s + b + a ;
		System.out.println(e); //마찬가지로 왼쪽부터 이루어짐
	}
}
