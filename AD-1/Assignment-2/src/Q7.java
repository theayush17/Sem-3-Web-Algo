package A2;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter decimal number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Hexadecimal equivalent number: ");
		dec(n);
		
		
	}

	public static void dec(int n) {
        int hex = 0;
        if (n == 0) {
        	return;
        }
        else {
            hex = n % 16;
            dec(n / 16);
        }
        if (hex > 9) {
            System.out.print((char) ('A' + (hex - 10)));
        }
        else {
            System.out.print(hex);
        }
    }
}
