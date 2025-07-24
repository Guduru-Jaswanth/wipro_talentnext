package Abstarction;

public class LamdaDemo {
	 public static void main(String[] args) {
	        Test t1 = (a, b, c) -> a + b + c;
	        Test t2 = (a, b, c) -> a * b * c;

	        int result1 = t1.myFunction(2, 3, 4);
	        int result2 = t2.myFunction(2, 3, 4);

	        System.out.println("Addition: " + result1);
	        System.out.println("Multiplication: " + result2);
	    }
	 interface Test {
		    int myFunction(int a, int b, int c);
		}

	}


