package chap07.textbook.s070703_2;

public class Tire {
	String position; //타이어 위치
	int maxTire;// 회전수명
	int goTire; // 달린 회전수
	
	public Tire(String position, int maxTire) {
		this.position = position;
		this.maxTire = maxTire;
	}
	public boolean go() {
		goTire++;
		if (goTire < maxTire) {
			System.out.println("남은수명 : " + (maxTire-goTire));
			return true; // 달리기가능하면 true;
		} else {
			System.out.println(position+"타이어 펑크남");
			return false; // 달리기 불가능하면 false;
		}
		
	}
	
}
