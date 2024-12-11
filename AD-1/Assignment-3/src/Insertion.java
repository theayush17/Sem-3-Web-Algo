package A3;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5, 1, 2, 4, 3, 7, 6};
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		insertion(a);
	}
	public static void insertion(int a[]) {
		for(int j=1;j<a.length;j++) {
			int key=a[j];
			int i=j-1;
			while(i>=0&& a[i]>key) {
				a[i+1]=a[i];
				i=i-1;
			}
			a[i+1]=key;
		}
		System.out.print("\nSorted Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
