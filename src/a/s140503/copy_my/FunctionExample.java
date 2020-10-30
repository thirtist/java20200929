package a.s140503.copy_my;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(new Student("신", 90, 70), new Student("홍", 70, 80),
			new Student("박", 94, 74));

	public static void printString(Function<Student, String> function) {

		for (Student student : list) {
			System.out.println(function.apply(student));
		}
	}

	public static void printInt(Function<Student, Integer> function) {

		for (Student student : list) {
			System.out.println(function.apply(student));
		}
	}

	public static double avg(Function<Student, Integer> function) {
		int sum = 0;

		for (Student student : list) {
			sum += function.apply(student);
		}
		double avg = (double) sum / list.size();
		return avg;

	}

	public static void main(String[] args) {
		printString(t -> t.getName());
		printInt(t -> t.getEnglishScore());
		printInt(t -> t.getMathScore());
		
		double eng = avg(t-> t.getEnglishScore());
		System.out.println(eng);
		
		double math = avg(t-> t.getMathScore());
		System.out.println(math);
	}

}
