package chap11.textbook.s110601;

import chap06.textbook.s060802.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();								//객체로부터 얻어옴
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());					//풀네임(패키지+객체이름)출력
		System.out.println(clazz1.getSimpleName());				//객체이름출력
		System.out.println(clazz1.getPackage().getName());		//패키지이름출력
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("chap06.textbook.s060802.Car");  //문자열로부터 얻어옴(forName())
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
