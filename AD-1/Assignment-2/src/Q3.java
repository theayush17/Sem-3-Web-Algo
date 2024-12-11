package A2;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter n: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Factorial: "+fact(n));
	}
	public static int fact(int n){
		if(n==0||n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
}
