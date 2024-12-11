package A5;
public class Q2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 7, 10};
        System.out.print("Array : ");
        for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] +" ");
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        boolean[] present = new boolean[max + 1];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                present[a[i]] = true;
            }
        }
        
        System.out.print("\nMissing numbers: ");
        for (int i = 1; i <= max; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}