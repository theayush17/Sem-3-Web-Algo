package A3;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,9 , 1, 2, 4, 3, 7, 6};
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		selection(a);
	}
	public static void selection(int a[]) {
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		System.out.print("\nSorted Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
