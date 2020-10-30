package chap14.lecture.api.supplier;

import java.util.function.Supplier;

public class SupplierEx1 {
	public static void main(String[] args) {
		Supplier<Double> nextDouble = () -> Math.random();  //return값이 하나면 {}도 생략
		Supplier<Integer> nextLottoBall = () -> (int) (Math.random()*45+1);
		
		System.out.println(nextDouble.get());
		
		for (int i=0;i<6;i++) {
			System.out.println(nextDouble.get());
		}
		for (int i=0;i<6;i++) {
			System.out.println(nextLottoBall.get());
		}
	}
}
