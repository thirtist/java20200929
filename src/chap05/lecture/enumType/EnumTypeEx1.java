package chap05.lecture.enumType;

public class EnumTypeEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1 instanceof Object);
		
		MyEnum e1 = MyEnum.VALUE1; //클래스를 만들지않고 바로 접근가능=마치 상수사용과 비슷
		MyEnum e2 = MyEnum.MY_VALUE4;
		MyEnum e3 = MyEnum.MY_VALUE4;
		
		System.out.println(e2 == e3);
		System.out.println(e1.toString());  //enum도 클래스긴 해서 toString()사용가능
		
		System.out.println(e1 instanceof Object);  //enum도 클래스니 Object을 상속하긴하지만
		System.out.println(e1 instanceof Enum);    //Enum을 상속하기도함
		System.out.println(e1 instanceof MyEnum);  
		
	}
}

class MyClass {
	
}