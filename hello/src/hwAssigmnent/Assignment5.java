package hwAssigmnent;

public class Assignment5 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,8,9}; 
		for(int i=0; i<a.length/2; i++)
		{
			int p=a[i];
			int q=a[a.length-1-i];
			a[i]=q;
			a[a.length-1-i]=p;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");

	}

	}

}
