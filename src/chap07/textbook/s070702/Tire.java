package chap07.textbook.s070702;

public class Tire {
	//필드
	public int maxRoation;			//최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location; 		//타이어의 위치

	//생성자
	public Tire(String location, int maxRoation) {
		this.maxRoation = maxRoation;
		this.location = location;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;  //누적 회전수 1증가
		if(accumulatedRotation < maxRoation) {
			System.out.println(location + "Tire 수명:" + (maxRoation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}
	
	
}
