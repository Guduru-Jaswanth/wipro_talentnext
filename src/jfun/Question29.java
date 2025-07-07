package jfun;
import java.util.*;
public class Question29 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
        sc.close();
        boolean skip = false;
        int sum =0;
        for(int i = 0;i<n;i++) {
        	if(arr[i] == 6) {
        		skip = true;
        	}
        	if(!skip) {
        		sum+=arr[i];	
        	}
        	if(skip&& arr[i]==7) {
        		skip =false;
        	}
        }
        System.out.println(sum);
	}
}
