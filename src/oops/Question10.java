package oops;
import java.util.*;

public class Question10 {


		  public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter the string: ");
		        String s = sc.nextLine();
		        
		        System.out.print("Enter the value of n: ");
		        int n = sc.nextInt();
		        
		        String lastN = s.substring(s.length() - n);
		        StringBuilder result = new StringBuilder();
		        
		        for (int i = 0; i < n; i++) {
		            result.append(lastN);
		        }
		        
		        System.out.println("Output: " + result.toString());
		        sc.close();
		    }
		

	}


