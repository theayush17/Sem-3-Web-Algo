package A2;
import java.util.Scanner;
public class Q7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter decimal number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n>0) {
			System.out.print(n%16);
		}
		
		
	}
	

}
