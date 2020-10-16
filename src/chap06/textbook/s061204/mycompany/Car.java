package chap06.textbook.s061204.mycompany;

import chap06.textbook.s061204.hankook.SnowTire;
import chap06.textbook.s061204.hyundai.Engine;
import chap06.textbook.s061204.kumho.BigWidthTire;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	chap06.textbook.s061204.hankook.Tire tire3 = new chap06.textbook.s061204.hankook.Tire();
	chap06.textbook.s061204.kumho.Tire tire4 = new chap06.textbook.s061204.kumho.Tire();
	
//	Tire tire5 = new Tire(); 앞에 클래스에 ctrl+shift+o 누르면 어느 패키지의 Tire클래스를 가져올지 선택하는게 나옴
}
