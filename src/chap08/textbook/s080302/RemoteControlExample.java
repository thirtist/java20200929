package chap08.textbook.s080302;

import chap08.textbook.s080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
			}

			@Override
			public void turnOff() {
			}

			@Override
			public void setVolume(int volume) {
			}
		};
	}
}
