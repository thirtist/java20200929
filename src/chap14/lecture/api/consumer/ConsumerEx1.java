package chap14.lecture.api.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {
	public static void main(String[] args) {
		Consumer<Integer> con1 = x -> System.out.println(x*2);
		con1.accept(30);
		
		System.out.println("=====list forEach method=====");
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(70);
		list.add(77);
		list.add(11);
		list.add(33);
		
		list.forEach(con1);
		System.out.println("=====list forEach method=====");
		
		list.forEach(x -> System.out.println("items :" +x));
		//consumer를 바로 람다식으로 써 넣음
	}
}
