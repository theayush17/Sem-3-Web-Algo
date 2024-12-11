package A5;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {23, 8, 15, 2, 17, 11};
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] +" ");
        }
        minmax(arr);
    }
    
    public static void minmax(int[] arr) {
        if (arr.length < 2) {
            System.out.println("\nArray should have at least two elements.");
            return;
        }
        
        Arrays.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        int minPair1 = 0, minPair2 = 0;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
                minPair1 = arr[i - 1];
                minPair2 = arr[i];
            }
        }
        
        int maxDiff = arr[arr.length - 1] - arr[0];
        int maxPair1 = arr[0];
        int maxPair2 = arr[arr.length - 1];
        
        System.out.println("\nMinimum difference pair: (" + minPair1 + ", " + minPair2 + "), Difference = " + minDiff);
        System.out.println("Maximum difference pair: (" + maxPair1 + ", " + maxPair2 + "), Difference = " + maxDiff);
    }
}