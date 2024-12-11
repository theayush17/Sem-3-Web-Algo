package A5;

public class Q1 {
    public static void main(String[] args) {
         int[] ar = {1, 2, 3, 4, 2, 3, 10,11,10};
         printDuplicates(ar);
        }
    
    public static void printDuplicates(int[] ar) {
        System.out.print("Array : ");
        for (int i = 0; i < ar.length; i++) {
                System.out.print(ar[i] +" ");
        }
        System.out.print("\nDuplicate elements: ");
        boolean hasDup = false;
            
        for (int i = 0; i < ar.length; i++) {
             for (int j = i + 1; j < ar.length; j++) {
                  if (ar[i] == ar[j]) {
                      System.out.print(ar[i] + " ");
                      hasDup= true;
                      break; 
                    }
                }
            }
            
            if (!hasDup) {
                System.out.print("No duplicates found.");
            }
        }
    }