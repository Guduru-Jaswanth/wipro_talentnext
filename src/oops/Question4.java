package oops;
import java.util.*;
public class Question4 {

	
		 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        if (s.length() % 2 == 0) {
            String result = s.substring(0, s.length() / 2);
            System.out.println("Output: " + result);
        } else {
            System.out.println("Output: null");
        }
        sc.close();
    }

	}


