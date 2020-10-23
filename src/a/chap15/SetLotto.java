package a.chap15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetLotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set = getSixNumber();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------");
		for (Integer s : set) {
			System.out.println(s);
		}
		
	}

	public static Set<Integer> getSixNumber() {
		Set<Integer> set = new HashSet<>();

		while (set.size() < 6) {
			int number = (int) (Math.random() * 45 + 1);
			set.add(number);
		}
		return set;

	}
}
