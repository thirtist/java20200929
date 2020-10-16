package chap07.textbook.s070703_2;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i < 20; i++) {
			int indexTire = car.run();
			if (indexTire != -1) {
				System.out.println(car.tires[indexTire].position + "한국 타이어로 교체");
				car.tires[indexTire] = new Hankook(car.tires[indexTire].position, 15);
			}
			System.out.println("------------------");
		}
	}
}
