package chap11.object.hashcode;

public class HashCodeEx1 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1);
		System.out.println(o2);

		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		System.out.println("-----------------");
		String s1 = "java";
		String s2 = new String ("java");
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
