package chap07.myPractice.heroGun;

public class Hero {
	private Gun gun;

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	void attack() {
		gun.fire();
	}
	
	
	
}
