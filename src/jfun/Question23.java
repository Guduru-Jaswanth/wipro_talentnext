package jfun;

public class Question23 {

	public static void main(String[] args) {
		int arr[] = {1,3,3,2,3,5,6};
		int max = arr[0];
		int min = arr[0];
		for(int num : arr) {
			if(num>max) {
				max = num;
			}
			if(num<min) {
				min = num;
			}
			
		}
		System.out.println(max);
		System.out.println(min);

	}

}
