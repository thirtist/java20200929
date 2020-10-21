package chap11.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		//byte,short,int,long
		//float,double,char,boolean
		
		//Byte,Short,Integer,Long			  //기본타입을 감싸는 타입
		//Float, Double, Character, Boolean   //참조타입처럼 쓰고 싶어서 Wrapper클래스를 만들었음

		int i = 1;
		
		Integer in = Integer.valueOf(i); //Wrapping하는 코드-예전버전은 써줬어야함
		
		
//		method1(i); //참조타입과 기본타입은 서로 변환이나 비교를 못함
		method1(in);
		
		
		//최근버전
		int j =2;
		method1(j); //자동적으로 Wrapping이 작동함 = atuoWrapping이 작동함
		
		int l = in.intValue(); //아주 예전에는 언박싱하는 코드를 썻어야함
		int k = in;  // 언박싱
		
		Integer in2 = 3;  //박싱  (오토)
		int m = in2;      //언박싱(오토)
	
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}
}
