package chap07.myPractice.heroGun;

public class HeroExample {
	public static void main(String[] args) {
		Hero hero = new Hero();
		
		hero.setGun(new WaterGun());
		
		hero.attack();
		
	}
}
