package A2;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter first number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print("Enter second number: ");
		
		int b=sc.nextInt();
		System.out.println("GCD of "+a+" and "+b+" : "+gcd(a,b));
	}
	public static int gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}

}
