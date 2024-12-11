package A5;

public class Q4 {
    public static void main(String[] args) {
        int[] ar = {1, 3, 2, 1, 3, 4, 1, 3, 2, 1, 3, 3, 5};
        findMax(ar);
    }

    public static void findMax(int[] ar) {
        int maxCount = 0;
        int maxElement = ar[0];

        for (int i = 0; i < ar.length; i++) {
            int currentCount = 1;

            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxElement = ar[i];
            }
        }

        System.out.println("Maximum repeated element: " + maxElement);
        System.out.println("No. of times repeated: " + maxCount);
    }
}