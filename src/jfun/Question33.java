package jfun;
import java.util.*;
public class Question33 {
	public static int [] middleWay(int  [] a ,int  [] b) {
		return new int[] {a[1],b[1]};
	}
	public static void main(String[] args) {
		int[] result1 = middleWay(new int[] {1,2,3}, new int[] {4,5,6} );
		System.out.println(Arrays.toString(result1));
 }
}
