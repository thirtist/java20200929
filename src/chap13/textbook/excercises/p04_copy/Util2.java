package chap13.textbook.excercises.p04_copy;

public class Util2 {

	public static <K,V,L,T> V getValue(Pair<K, V> pair, OtherPair <L, T> pair2) {
		
		if (pair.getKey() == pair2) {
			return pair.getValue();
		}
		
		return null;
	}
}
