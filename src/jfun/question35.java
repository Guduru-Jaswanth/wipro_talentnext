package jfun;
import java.util.*;
public class question35 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.println("enter the values of the array: ");
		int arr[] [] = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the array is: ");
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int max=arr[0][0];
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				if(arr[i][j] >max) {
					max =arr[i][j];
				}
			}
			
		}
		System.out.println(max);
		sc.close();
		
	}

}
