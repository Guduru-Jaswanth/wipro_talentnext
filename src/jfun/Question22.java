package jfun;
import java.util.Arrays;

public class Question22 {

	public static void main(String[] args) {
		
		int numbers [] = {10,20,30,40};
		System.out.println(Arrays.toString(numbers));
		int sum =0;
		for(int num:numbers) {
			sum+=num;
		}
		double average = (double)sum/numbers.length;
		System.out.println(average);
	}

}
