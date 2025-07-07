package jfun;
import java.util.*;
public class Question31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		int result[] = new int[n];
		System.out.print("Enter the values: ");
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int index=0;
		for(int i =0;i<n;i++) {
			if(arr[i]%2==0) {
				result[index]=arr[i];
				index++;
			}	
		}
		for(int i =0;i<n;i++) {
			if(arr[i]%2!=0) {
				result[index]=arr[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(result));
	}

}
