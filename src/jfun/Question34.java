package jfun;
import java.util.*;
public class Question34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		int count =0;
		while(count<4) {
			if(sc.hasNextInt()) {
				arr[count]=sc.nextInt();
				count++;
			}
		}
		System.out.println("the values of the array are: ");
		System.out.println(arr[0]+" "+arr[1]);
		System.out.println(arr[2]+" "+ arr[3]);
		System.out.println("Reversed array is : ");
		System.out.println(arr[3]+ " "+ arr[2]);
		System.out.println(arr[1]+ " "+arr[0]);
		
	}

}
