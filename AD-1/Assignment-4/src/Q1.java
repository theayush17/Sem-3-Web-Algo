package A4;
import java.util.*;
public class Q1{
	public static int distinctEle(int a[]){
		int c=0;
		for(int i=0;i<a.length;i++){
			int j;
			for(j=0;j<i;j++){
				if(a[i]==a[j]){
					break;
				}
			}
			if(i==j)
				c++;
		}		
		return (c);
	}
	public static void main(String Args[]){
		Scanner sc= new Scanner(System.in);
		int a[]= {15,9 , 1, 2, 4, 3, 7, 6};
		System.out.print("Given array: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\nArray Reduced by: "+distinctEle(a));
	}
}