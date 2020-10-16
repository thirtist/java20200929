package chap07.textbook.s070703_2;

public class Car {
	//타이어 장착 필드
	Tire[] tires = new Tire[]{
		new Tire("1번", 10),
		new Tire("2번", 12),
		new Tire("3번", 13),
		new Tire("4번", 14)
	};
	
	
	int run () {
		System.out.println("자동차가 달립니다");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].go()==false) {
				stop();
				return i;
			}
		}
		return -1;
		
	}
	
	void stop() {
		System.out.println("자동차를 멈춥니다");
	}
	
	
	
}
