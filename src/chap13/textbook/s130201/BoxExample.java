package chap13.textbook.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		
		
		//원래는 아래처럼 안전하게 바꿀 수 있는지 검사해봐야했음
		
		Object o = box.get();
		if(o instanceof Apple) {
			Apple apple = (apple) o;
		}
	}
}
