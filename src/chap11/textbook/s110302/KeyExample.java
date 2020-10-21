package chap11.textbook.s110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//**//HashMap = 다른 클래스를 저장해서 모아놓음 <-저장할 때 식별키를 사용함
		//사전에서 단어 내용처럼 (키 밸류)로 저장을 함
		//그래서 키를 사용하면 밸류를 불러올 수 있음
		//입력할때 .put(키, 밸류); 가져올때 .get(키)
		
		
		//식별 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key(1),"홍길동");
		
		//식별 "new Key(1)"로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		
		/////////////////////////////
//		Key k1 = new Key(1);
//		Key k2 = new Key(1);
		
		
		
		
	}
}
