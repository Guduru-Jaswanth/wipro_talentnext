package oops;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the string: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		String result;
		if(s1.charAt(s1.length()-1)==s2.charAt(0)) {
			result = s1+s2.substring(1);
		}else {
			result = s1+" "+s2;
		}
		System.out.println("result: "+result);
		sc.close();
	}

}
