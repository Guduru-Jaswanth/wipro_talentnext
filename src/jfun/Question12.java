package jfun;
import java.util.Scanner;
public class Question12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the color code : ");
		char code = sc.next().charAt(0);
		code = Character.toUpperCase(code) ;
		if(code == 'R'){
			System.out.println("Red");
		}else if(code == 'B') {
			System.out.println("Blue");
		}else if(code =='G') {
			System.out.println("Green");
		}else if( code == 'O') {
			System.out.println("Orange");
		}else if (code == 'Y') {
			System.out.println("Yellow");
		}else if (code == 'W') {
			System.out.println("White");
		}else {
			System.out.println("INVALID");
		}	
		sc.close();
	}
}
