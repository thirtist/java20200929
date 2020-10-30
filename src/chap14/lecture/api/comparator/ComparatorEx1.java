package chap14.lecture.api.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComparatorEx1 {
	public static void main(String[] args) {
		Random random = new Random();
		// 두개의 값을 받아서 리턴
		// 음수, 0, 양수 중 리턴
		// 같으면 0
		// 왼쪽이 크면 양수
		java.util.Comparator<Integer> asc = (x, y) -> y-x;

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));
		}
		list.sort(asc);
		list.forEach(e -> System.out.println(e));

	}
}
