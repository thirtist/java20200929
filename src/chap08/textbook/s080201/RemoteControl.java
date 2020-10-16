package chap08.textbook.s080201;

public interface RemoteControl {
	
//	상수
	public int MAX_VOLUME = 10; // public static final 생략 가능
	public int MIN_VOLUME = 0;
	
//	추상메소드
	void turnOn(); // abstract 생략가능
	void turnOff();
	void setVolume(int volume);
	
//	디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
//	정적 메소드
	static void changeBatter() {
		System.out.println("건전지를 교환합니다.");
	}
}
