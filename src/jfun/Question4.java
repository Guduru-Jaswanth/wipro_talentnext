package jfun;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		if(one<0){
			System.out.println("The given number is negative");
		}
		if(one==0) {
			System.out.println("The number is zero");
		}
		else
		{
			System.out.println("The number is positive");
		}
		sc.close();
	}

}
