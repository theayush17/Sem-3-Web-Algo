package A1;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,3};
		int max=a[0],min=a[0];
		for (int i=1;i<a.length;i++){
		if (a[i]>max)
		max=a[i];
		if (min>a[i])
		min=a[i];
		}
		System.out.println("max: "+max);
		System.out.println("Min: "+min);
	}

}
