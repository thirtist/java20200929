package chap07.textbook.s070702;

public class HankookTire extends Tire{

	//필드
	//생성자
	public HankookTire(String location, int maxRoation) {
		super(location, maxRoation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;  //누적 회전수 1증가
		if(accumulatedRotation < maxRoation) {
			System.out.println(location + "HankookTire 수명:" + (maxRoation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
