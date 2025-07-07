package jfun;
import java.util.*;
public class Question20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the number : ");
		int num = sc.nextInt();
		sc.close();
		int temp = 0;
		while(num>0) {
		    int digit=num%10;
			temp=temp*10+digit;
			num/=10;
		}
		System.out.println(temp);
	}

}
