package chap15.lecture.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		//순서가 없고, 중복되지 않음
		Set<String> set = new HashSet<>();
		
		//추가
		set.add("java");
		set.add("html");
		set.add("css");
		set.add(new String("java")); //이미 있는 값이면 들어가지 않음
		
		System.out.println(set.size());
		
		set.remove("jquery");
		System.out.println(set.size());
		set.remove(new String("html"));
		System.out.println(set.size());
		
		//검색 (모두 탐색)
		for (String s : set) {
			System.out.println(s);
		}
		
		Iterator<String> iter = set.iterator(); //저장된 객체를 한번씩만 가져오는 반복자 리턴 
//		iter.hasNext();  //다음이 있는지 boolean으로 리턴 while이랑 잘 어울림
//		iter.next();	//다음거 가져옴 
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}
}
