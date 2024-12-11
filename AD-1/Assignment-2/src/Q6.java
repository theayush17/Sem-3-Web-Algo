package A2;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Enter power: ");
		int p=sc.nextInt();
		System.out.println(n+" to the power "+p+": "+power(n,p));
	}
	public static int power(int n, int p) {
		if(p==0) {
			return 1;
		}
		
		return n*power(n,p-1);
	}

}
