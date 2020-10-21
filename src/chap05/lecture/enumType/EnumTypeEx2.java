package chap05.lecture.enumType;

public class EnumTypeEx2 {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VALUE4;
		System.out.println(e1.name());
		System.out.println(e1.ordinal());
		
		MyEnum e2 = MyEnum.valueOf("VALUE3");// String에 해당하는 걸 찾아서 리턴
		System.out.println(e2.name());
		
		int diff = e1.compareTo(e2);  //ordinal을 구해서 차이를 리턴해줌 // 0이면 같은거 // 양수음수에따라서 순서구별가능
		System.out.println(diff);
		
		MyEnum[] arr = MyEnum.values(); //값들을 배열에 저장할 수 있음
		System.out.println(arr.length);
	}
}
