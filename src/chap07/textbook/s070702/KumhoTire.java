package chap07.textbook.s070702;

public class KumhoTire extends Tire{

	//필드
	//생성자
	public KumhoTire(String location, int maxRoation) {
		super(location, maxRoation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;  //누적 회전수 1증가
		if(accumulatedRotation < maxRoation) {
			System.out.println(location + "KumhoTire 수명:" + (maxRoation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
