import java.util.*;
public class Question18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		while(num>=1) {
			int temp=num%10;
			sum+=temp;
			num/=10;
		}
		System.out.println("sum of the digits is"+ sum);
	}

}
