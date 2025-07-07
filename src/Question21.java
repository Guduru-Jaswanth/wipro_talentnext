import java.util.*;
public class Question21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the number: ");
		int num = sc.nextInt();
		sc.close();
		int temp=num;
		int rev=0;
		while(num>0) {
			int digits = num%10;
			rev = rev*10+digits;
			num/=10;
			
		}
		if(temp==rev) {
			System.out.println(rev+" is palindrome number");
		}else {
			System.out.println(rev+" is not a palindrome number");
		}
	}

}
