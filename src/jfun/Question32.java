package jfun;
import java.util.*;
public class Question32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result[] = new int [n];
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1 || arr[i]==4) {
			 result[index]=arr[i];
			 index++;
			}
		}
		System.out.println(Arrays.toString(result));
		sc.close();
	}

}
