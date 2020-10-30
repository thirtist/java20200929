package a.s140503;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	);
	
	public static void printString(Function<Student,String> function) {
		for(Student student : list) {  //list에 저장된 항목 수만큼 루핑
			System.out.println(function.apply(student) + " ");
			//매개변수로 Function인터페이스의 객체를 받음 => 사용할 때 매개변수에 람다식넣는게 결정
			//(매개변수로 받는게 아니고)list를 전체탐색하여 각 객체에 따른에 따른 String을 출력하도록 했음
		}
		System.out.println();
	}
	
	public static void printInt ( ToIntFunction<Student> function) {  //매개변수를 FunctionalInterface로 결정하면
		for (Student student : list) {								  //나중에 무슨 값을 읽도록 변경하냐에따라서
			System.out.println(function.applyAsInt(student)+"");	  //이 기능이 바뀜
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[학생이름]");
		printString(t->t.getName());  //사용할 때 람다식을 넣음
		// 앞의 t-> student 객체 // 뒤의 값 = return할 것

		System.out.println("[영어점수]");
		printInt(t->t.getEnglishScore());
		
		System.out.println("[학생이름]");
		printInt(t->t.getMathScore());
		
	}
	
}
