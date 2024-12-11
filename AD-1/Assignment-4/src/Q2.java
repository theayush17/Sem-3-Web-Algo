package A4;
import java.util.*;
public class Q2 {
    public static void merge(int[] ar1, int[] ar2, int[] ar3) {
        int n1 = ar1.length;
        int n2 = ar2.length;
        int i = 0, j = 0, k = 0;

        while (i < n1) {
            ar3[k++] = ar1[i++];
        }

        while (j < n2) {
            ar3[k++] = ar2[j++];
        }

        for (int m = 0; m < ar3.length - 1; m++) {
            for (int n = 0; n < ar3.length - m - 1; n++) {
                if (ar3[n] > ar3[n + 1]) { 
                    int temp = ar3[n];
                    ar3[n] = ar3[n + 1];
                    ar3[n + 1] = temp;
                }
            }
        }
		System.out.print("\nSorted array: ");
		for(int m=0;m<ar3.length;m++) {
			System.out.print(ar3[m]+" ");
		}   
	}

    public static void main(String[] args) {
        int[] ar1 = {1,4,5,9,99,3};
        System.out.print("Array 1 : ");
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
        int[] ar2 = {2, 8, 66, 18, 2,1};
        
        System.out.print("\nArray 2 : ");
		for(int i=0;i<ar2.length;i++) {
			System.out.print(ar2[i]+" ");
		}
        int[] ar3 = new int[ar1.length + ar2.length];

        merge(ar1, ar2, ar3);

        
    }
}