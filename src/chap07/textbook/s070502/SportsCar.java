package chap07.textbook.s070502;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed +=10;
	}
	//오버라이딩불가
	@Override
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
