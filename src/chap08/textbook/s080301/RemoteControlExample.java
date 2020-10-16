package chap08.textbook.s080301;

import chap08.textbook.s080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
		
		rc.setMute(true);
		
		RemoteControl.changeBatter();
		

	}
}
