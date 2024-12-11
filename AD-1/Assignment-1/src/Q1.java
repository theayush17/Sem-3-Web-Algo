package A1;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for (int i=0;i<=n;i++){
		sum=sum+i;
		}
		System.out.println("Sum: "+sum);
	}

}
