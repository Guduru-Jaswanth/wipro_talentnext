package jfun;
import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System .in);
		System.out.println("Enter the alphabet :");
		char ch = sc.next().charAt(0);
		if(Character.isUpperCase(ch)) {
			char lower  = Character.toLowerCase(ch);
			System.out.println(ch +" -> "+lower);
		}else if(Character.isLowerCase(ch)) {
			char upper = Character.toUpperCase(ch);
			System.out.println(ch +" -> "+upper);
		}else {
			System.out.println("invalid plese enter alpahbet");
		}
		sc.close();
	}

}
