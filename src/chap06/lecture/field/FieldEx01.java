package chap06.lecture.field;

public class FieldEx01 {
	public static void main(String[] args) {
		int i;
		i = 3;
		
		Car c1 = new Car();
		c1.name = "kia";
		c1.model = "k7";
		c1.price = 500;
		
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.price);
		
		Car c2 = new Car();
		System.out.println(c2.name);
		
		c2.name = "kiaaaa";
		c2.model = "k2237";
		c2.price = 50044;
		
		System.out.println(c2.name);
		System.out.println(c2.model);
		System.out.println(c2.price);
		
		
		
	}

}
