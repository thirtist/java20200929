package chap06.lecture.encapsulation;

public class Car {
	private int speed;
	private String name;
	private String model;
	private int price;

	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
		}
	}

	public int getSpeed() {
		return this.speed;
	}

	
	//소스 -> getter setter로 만들 수 있음
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
