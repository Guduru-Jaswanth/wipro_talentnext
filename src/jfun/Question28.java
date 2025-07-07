package jfun;
import java.util.*;
public class Question28 {

	public static void main(String[] args) {
		int arr[] = {1, 2,3,3,4,2,1};
		Set<Integer> set = new LinkedHashSet<>();
		for( int num : arr) {
			set.add(num);
		}
		System.out.print("{");
	    int i =0;
	    for(int num : set) {
	    	System.out.print(num);
	    	if(i<set.size()-1) System.out.print(", ");
	    	i++;
	    }
		System.out.print("}");		

	}

}
