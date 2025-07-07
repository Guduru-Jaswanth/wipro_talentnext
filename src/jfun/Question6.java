package jfun;
import java.util.Scanner;
public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		System.out.println(isOddOrEven(number));

	}
	public static boolean isOddOrEven(int a) {
		return(a%2==0);
	}

}
