package chap11.object.equals;

public class EqualsEx1 {
	public static void main(String[] args) {
		Book b1 = new Book(963);
		Book b2 = new Book(963);
		
		System.out.println(b1 == b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());  //바코드는 같은데 다른책
		System.out.println(b1.equals(b2));  //이게 true가 되게 하고 싶으면 equals를 재정의하기전에 hashCode(서랍)을 먼저 재정의 해줘야함
		
		System.out.println("------------------");
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
	}
}
