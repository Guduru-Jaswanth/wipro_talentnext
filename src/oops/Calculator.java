package oops;

public class Calculator {
	public static int powerInt(int num1,int num2) {
		return(int)Math.pow(num1, num2);
	}
	public static double powerDouble(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) {
		int result = Calculator.powerInt(2,3);
		double result2 = Calculator.powerDouble(3.5,4);
		System.out.println(result);
		System.out.println(result2);
		
	}

}
