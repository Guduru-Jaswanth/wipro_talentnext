package jfun;
import java.util.*;
public class Question30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int [n];
		System.out.print("Enter the values");
		for(int i=0;i<n;i++) {
		   arr[i] = sc.nextInt();
		}
		sc.close();
		int result[] = new int[n];
		int index =0;
		for(int i =0;i<n;i++) {
			if(arr[i]!=10) {
				result [index]= arr[i];
				index++;
			}
		}
		
			System.out.print(Arrays.toString(result));
			
		}
	
	}


