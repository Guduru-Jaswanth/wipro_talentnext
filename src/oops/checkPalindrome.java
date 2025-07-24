
package oops;
import java.util.*;
public class checkPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		sc.close();
		String s2 ="";
		for(int i = s.length()-1;i>=0;i--) {
			s2+=s.charAt(i);
		}
		if(s.equalsIgnoreCase(s2)) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("it is nor a palindrome");
		}
		
	}

}
