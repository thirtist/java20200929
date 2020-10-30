package chap14.lecture.api.methodref;

import java.util.Random;
import java.util.function.Supplier;

class Car{
	
}

public class MethodRefEx1 {
	public static void main(String[] args) {
		Supplier<Double> random = () -> Math.random();  //호출만하고 끝나는 경우 메소드 참조사용가능
		Supplier<Double> ran2 = Math::random;  //파라미터와 리턴타입이 똑같다면 클래스명::매소드명만쓰면됨
		
		Random rand = new Random();
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());
		
		Supplier<Integer> nextInt3 = () -> rand.nextInt();
		Supplier<Integer> nextInt2 = rand::nextInt;
		
		Supplier<Car> nextCar = () -> new Car();
		Supplier<Car> newxCar2 = Car::new;     //이런게 있다고만 알고있고 책 예제도 안함
		
	}
}
