package jfun;
import java.util.Scanner;
public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char ch =sc.next().charAt(0);
		if(ch>= 'a' &&ch<= 'z'||ch>='A' &&ch<='Z') {
			System.out.println("Alphabet");
		}else if(ch>='0'&& ch<='9'){
			System.out.println("Number");
		}else {
			System.out.println("Special character");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
