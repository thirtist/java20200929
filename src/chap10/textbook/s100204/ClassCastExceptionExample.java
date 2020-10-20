package chap10.textbook.s100204;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog = (Dog) animal; //ClassCastException 발생가능
		System.out.println("개로 변환 성공");
		}
	}
}

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}

