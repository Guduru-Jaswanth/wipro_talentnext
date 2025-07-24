package oops;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		int n = s.length();
		String result = "";

		String firstTwo = (n < 2) ? s : s.substring(0, 2);

		for (int i = 0; i < n; i++) {
			result += firstTwo;
		}

		System.out.println("Output: " + result);
		sc.close();
		}
}
