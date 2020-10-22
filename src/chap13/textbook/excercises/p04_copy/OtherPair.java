package chap13.textbook.excercises.p04_copy;

public class OtherPair <L,T> {
	private L key;
	private T value;
	
	
	public OtherPair(L key, T value) {
		this.key = key;
		this.value = value;
	}
	
	public L getKey() {
		return key;
	}

	public T getValue() {
		return value;
	}
}
