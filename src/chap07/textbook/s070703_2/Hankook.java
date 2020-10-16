package chap07.textbook.s070703_2;

public class Hankook extends Tire {

	public Hankook(String position, int maxTire) {
		super(position, maxTire);
	}

	@Override
	public boolean go() {
		goTire++;
		if (goTire < maxTire) {
			System.out.println("남은수명 : " + (maxTire - goTire));
			return true; // 달리기가능하면 true;
		} else {
			System.out.println(position + "한국 타이어 펑크남");
			return false; // 달리기 불가능하면 false;
		}
	}

}
