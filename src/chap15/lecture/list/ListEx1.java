package chap15.lecture.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		//순서가 있고 중복허용
		List<String> list = new ArrayList<>();
		
		//추가
		list.add("java");
		list.add("html");
		list.add("css");
		list.add("java");  //순서가 있어서 중복가능
		
		System.out.println(list.size());
		
		//검색
		System.out.println(list.get(1));
		
		//수정
		list.set(3, "jsp");
		System.out.println(list.get(3));
		
		//삭제
		list.remove(2); //삭제되면 빈칸이 없어지고 인덱스가 한칸씩 당겨짐!!!!!
		System.out.println(list.get(2));
		
		// 모든값 탐색
		System.out.println("모든 요소 탐색");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("모든 요소 탐색 향상된for문");
		for (String s : list) {
			System.out.println(s);
		}
		
		
		//타입파라미터
		List<Integer> listInt = new ArrayList<>();
		list.add("servlet");
		listInt.add(3);
		
		List listNotype = new ArrayList(); //아주 옛날에는 타입파라미터가 없어서 없는 코드가 있음(오브젝트타입만 받을 수 있음)
		listNotype.add("string");			//그런데
		listNotype.add(3);
		
		Object o1 = listNotype.get(0);		//꺼낼때는 object로 꺼내야하니까 강제캐스팅을 해야하는 위험성이 있음
		Object o2 = listNotype.get(1);
		
		
	}
}
