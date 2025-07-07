package jfun;
import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter gender(male/female):");
		String gender = sc.nextLine();
		System.out.print("Enter age :");
		int age = sc.nextInt();
		if(gender.equals("male") && age >=1 && age<=58) {
			System.out.println("The interest is 8.4%");	
		}else if(gender.equals("male")&& age>=59 && age<=100) {
			System.out.println("The interest is 10.5%");
		}else if(gender.equals("female") && age>=1 && age<=58){
			System.out.println("The interest is 8.2%");
		}else if(gender.equals("female")&& age>=59 && age<=100){
			System.out.println("The interest is 9.2%");
		}else{
			System.out.println("inavlid");
		}
		sc.close();
	}
}
