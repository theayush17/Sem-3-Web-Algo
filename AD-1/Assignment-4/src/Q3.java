package A4;
import java.util.*;
public class Q3 {
	static boolean checkReverse(int arr[], int n) { 
		for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                return false; 
            }
        }
        return true;
	}
	    
	public static void main(String[] args) { 
		int arr[] = {5,4,3}; 
	    int n = arr.length; 
	    System.out.print(checkReverse(arr, n)); 
	} 
		  
} 
		//This code contributed by 29AjayKumar

