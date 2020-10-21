package chap05.lecture;

public class ReferenceType5 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = new String("java");
		
		str2 = null;
		
		// java virtual machine 은
		// 불필요한 인스턴스를 모아 제거함
		// -->> garbage collector (gc)
	}
}
