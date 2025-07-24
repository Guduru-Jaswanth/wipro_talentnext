package oops;
class Animal{
	void eat(){
		System.out.println("animal is eating");
	}
	void sleep(){
		System.out.println();
	}
}
class Bird extends Animal{
	@Override
	void eat() {
		System.out.println("bird is eating food");
	}
	@Override
	void sleep() {
		System.out.println("bird is sleeping");
	}
	void fly() {
		System.out.println("bird is flying");
	}
}

public class Question1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sleep();
		a.eat();
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
	}
}
