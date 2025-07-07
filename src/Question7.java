import java.util.Scanner;
public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    if(s.trim().isEmpty()) {
	    	System.out.println("No values");
	    }else {
	    	String[] arr = s.split("\\S+");
	    	for(int i = 0;i<arr.length;i++) {
	    		if(i==arr.length-1) {
	    			System.out.print(arr[i]);
	    		}else {
	    			System.out.print(arr[i] + " , " );
	    		}
	    	}
	    	
	    }
	    sc.close();
	    

	}

}
