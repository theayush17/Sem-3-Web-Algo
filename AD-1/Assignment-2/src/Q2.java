package A2; 
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,3,5,1,5};
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		}
		System.out.println("\nMax element: "+Max(a,a.length));
	
		System.out.println("Min element: "+Min(a,a.length));
	}
	public static int Max(int a[],int n) {
		if (n==1) {
			return a[0];
		}
		else {
			return Math.max(a[n-1], Max(a, n-1));
		}
	}
	public static int Min(int a[],int n) {
		if (n==1) {
			return a[0];
		}
		else {
			return Math.min(a[n-1], Min(a, n-1));
		}
	}
                       
}
