package oops;
import java.util.*;

public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*') {
				continue;
			}
			if (i > 0 && s.charAt(i - 1) == '*') {
				continue;
			}
			if (i < s.length() - 1 && s.charAt(i + 1) == '*') {
				continue;
			}
			result.append(s.charAt(i));
		}

		System.out.println("Output: " + result.toString());
		sc.close();
	}
}
