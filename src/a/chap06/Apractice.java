package a.chap06;

public class Apractice {

	// 필드
	private int speed;
	private int level;

	// 생성자
	public Apractice(int speed, int level) {
		this.speed = speed;
		this.level = level;
	}

	// getter setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// 상수선언
	final static int HUMAN_HEIGHT;

	// 클래스필드
	static String kind;

	static {
		kind = "human";
		HUMAN_HEIGHT = 30;
	}

	// 클래스 메소드
	static String sleep(String kind2) {
		return kind = kind2;
	}

}
