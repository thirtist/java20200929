package chap15.textbook.s150401;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1_MY {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 85);
		map.put("동장군", 85);
		map.put("홍길동", 83);
		System.out.println("총 Entry수:"+ map.size());
		
		
		Set<Entry<String, Integer>> entrys = map.entrySet();
		for (Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 :" + map.size());
		
	}
}
