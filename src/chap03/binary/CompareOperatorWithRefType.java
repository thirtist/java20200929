package chap03.binary;

public class CompareOperatorWithRefType {
	public static void main(String[] args) {
		String s = "java";
		String t = "java";

		String u = "ja";
		String v = "va";
		String w = u + v;
		
		System.out.println(s);
		System.out.println(t);
		System.out.println(w);

		System.out.println(s == t);
		System.out.println(s == w);
		
	}

}
