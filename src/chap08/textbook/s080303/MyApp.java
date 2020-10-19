package chap08.textbook.s080303;

import chap08.textbook.s080201.RemoteControl;

public class MyApp {
	public static void main(String[] args) {
		SmartTelevision o1 = new SmartTelevision();
		RemoteControl r1 = o1;
		Searchable s1 = o1;
		
		s1.search("daum");
//		s1.turnOn();   Searchable에 없으니 사용불가
//		s1.turnOff();
		
		r1.turnOn();
		r1.turnOff();
		r1.setVolume(3);
//		r1.search("google") RemoteControl에 없으니 사용불가
		
		//2개를 구현한 스마트 텔레비전을 각각의 인터페이스에 담고 사용할 때
		//서로의 것만 실행가능(당연)
		
		
		//형변환에 관한내용
		
		System.out.println(r1 instanceof RemoteControl); //true
		System.out.println(r1 instanceof Searchable);  //true
		System.out.println(s1 instanceof RemoteControl); //true   //원래부터 그 클래스로 만들어졌던거니까 같은 인터페이스를 구현했으면
		System.out.println(s1 instanceof Searchable);  //true     //서로 다른 인터페이스로 강제 형변환도 가능(당연)
		
	}
}
