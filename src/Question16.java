import java.util.*;
public class Question16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		
		if(num<=1) {
			System.out.println("not prime");
			return;
		}
		boolean isPrime =true;
		for(int i =2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
			if(isPrime == true) {
				System.out.println(num+" is prime number");
			}else {
				System.out.println(num+" is not a prime number");
			}
	}
}
