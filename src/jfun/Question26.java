package jfun;
import java.util.Arrays;

public class Question26 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		Arrays.sort(arr);
		int smallest1 = arr[0];
		int smallest2 = arr[1];
		int largest1= arr[arr.length-1];
		int largest2=arr[arr.length-2];
		System.out.print(smallest1+","+smallest2+" "+largest1+","+largest2);

	}

}
