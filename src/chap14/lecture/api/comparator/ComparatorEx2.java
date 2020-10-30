package chap14.lecture.api.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComparatorEx2 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Member> list = new ArrayList<>();
		
		for (int i = 9; i <100; i++) {
			list.add(new Member(random.nextInt(100), "java"));
		}
		
		list.sort((x,y) -> x.getId() - y.getId());
		// list.sort(c);
		
		list.forEach(e-> System.out.println(e));
		
	}
}
