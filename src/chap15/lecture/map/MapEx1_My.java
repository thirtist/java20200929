package chap15.lecture.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1_My {
	public static void main(String[] args) {
		// (key, Value)쌍 (Entry)로 저장
		// dictionary

		Map<Integer, String> map = new HashMap<>();

		// 추가(입력)
		map.put(100, "kim");
		map.put(30, "hong");
		map.put(22, "lee");
		map.put(11, "choi");
		map.put(200, "jin");

		// 전체탐색 연습해보기 1.keySet()과 .getSet(k) - 향상된 for문

		Set<Integer> set = map.keySet();
		for (Integer key : set) {
			System.out.println(key + ":" + map.get(key));
		}

		System.out.println("-------------------------------");

		// iterator문 .iterator()와 .hasNext .next
		Set<Integer> set2 = map.keySet();
		Iterator<Integer> iterator = set2.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + ":" + map.get(key));
		}

		System.out.println("--------------------------------");

		// 전체탐색 연습해보기 2.Entry문 향상된for문
		Set<Map.Entry<Integer, String>> entrys = map.entrySet();
		for (Map.Entry<Integer, String> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("--------------------------------");

		// iterator문
		Set<Map.Entry<Integer, String>> entrys2 = map.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator2 = entrys2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<Integer, String> a = iterator2.next();
			Integer b = a.getKey();
			String c = a.getValue();
			System.out.println(b+":"+c);
		} 

	}
}
