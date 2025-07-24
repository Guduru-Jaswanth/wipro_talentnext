package oops;
class Shape
{
	void draw() {
		System.out.println("drawing shape");
	}
	void  erase() {
		System.out.println("Erasing shape");
	}
}
class Circle extends Shape{

	void draw() {
		System.out.println("drawing shape");
	}
	void  erase() {
		System.out.println("Erasing shape");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("drawing shape");
	}
	void  erase() {
		System.out.println("Erasing shape");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("drawing shape");
	}
	void erase() {
		System.out.println("erasing shape");
	}
}

public class TestShape {
	public static void main(String [] args ) {
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		
		
	}

}
