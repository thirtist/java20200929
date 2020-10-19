package chap08.textbook.s080503;

import chap08.textbook.s080502.HankookTire;
import chap08.textbook.s080502.Tire;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
