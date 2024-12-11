package A1;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter k: ");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int a[]={1,2,3,4,5,6};
		int n=a.length;
		if(k>=n)
			return;
		int temp[]=new int[n];
		int x=0;
		for(int i=k;i<n;i++){
		temp[x++]=a[i   ];
		}
		for(int i=0;i<k;i++){
		temp[x++]=a[i];
		}
		System.out.print("Rotated array: ");
		for(int i=0;i<n;i++)
		System.out.print(temp[i]+" ");
	}
}