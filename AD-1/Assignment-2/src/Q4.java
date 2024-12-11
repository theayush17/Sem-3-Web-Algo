package A2;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter n: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("nth fibonacci: "+fibo(n));
	}
	public static int fibo(int n){
		if(n==1||n==2){
			return n-1;
		}
			return fibo(n-1)+fibo(n-2);	
	}
}
