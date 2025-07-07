package jfun;
import java.util.*;
public class Question24 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		int index =-1;
		for(int i = 0;i<=arr.length;i++) {
			if(arr[i]==num){
				index =i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("-1");
		}else {
			System.out.println(index);
		}
		
		

	}

}
