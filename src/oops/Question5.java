package oops;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        if (s.length() <= 2) {
            System.out.println("Output: ");
        } else {
            String result = s.substring(1, s.length() - 1);
            System.out.println("Output: " + result);
        }
        sc.close();
	}

}
