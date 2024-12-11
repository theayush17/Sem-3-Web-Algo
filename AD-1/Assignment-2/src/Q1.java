package A2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter n: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum: "+sum(n));
		
		
	}
	public static int sum(int n) {
		if(n==0)
			return 0;
		return (n+sum(n-1));
	}

}
