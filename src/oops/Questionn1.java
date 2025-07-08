package oops;
public class Questionn1 {
	double width,length,height;
	public Questionn1(double width,double length,double height ) {
		this.width = width;
		this.length=length;
		this.height=height;
	}
	public double getVolume() {
		return width*length*height;
	}
	public static void main(String[] args) {
		Questionn1 mybox= new Questionn1(3.0,5.0,4.0);
		System.out.println(mybox.getVolume());
		
	}

}
