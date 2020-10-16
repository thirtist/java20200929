package chap07.textbook.s070703;

import chap07.textbook.s070702.Tire;

public class Car {
	//필드
	Tire[] tires = {
		new Tire("앞왼쪽",6),
		new Tire("앞오른쪽",2),
		new Tire("뒤왼쪽",3),
		new Tire("뒤오른쪽",4)
	};
	
	//메소드
	int run() {
		System.out.println("[자동차가달립니다]");
		for (int i=0; i<tires.length; i++) {
			if (tires[i].roll()==false) {
				//tires[i].roll()을 실행해도 각 타이어의 .roll()이 실행됨(tire의 roll() 메소드가 아니고)
				stop();
				return (i+1); //펑크난 타이어의 위치를 리턴함(index+1)(1~4)
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가멈춥니다]");
	}
	
}
