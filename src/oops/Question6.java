package oops;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        String result = (a.length() < b.length()) ? a + b + a : b + a + b;
        System.out.println("Output: " + result);
        sc.close();
    }
	}


