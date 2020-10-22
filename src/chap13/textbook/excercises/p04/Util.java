package chap13.textbook.excercises.p04;

public class Util {

	public static <K,V> V getValue(Pair<K, V> pair, K pair2) {
		
		if (pair.getKey() == pair2) {
			return pair.getValue();
		}
		
		return null;
	}
}
