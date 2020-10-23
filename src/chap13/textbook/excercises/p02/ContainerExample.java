package chap13.textbook.excercises.p02;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<>(); //뒤는 생략가능
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);
	}
}
