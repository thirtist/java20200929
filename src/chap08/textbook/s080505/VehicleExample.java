package chap08.textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); (x) vehicle 인터페이스에는 없는 메소드
		
		Bus bus = (Bus) vehicle; //강제 타입변환
		
		bus.run();
		bus.checkFare(); // Bus클래스에는 checkFare()가 있음
		
		System.out.println("--------------");
		
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
