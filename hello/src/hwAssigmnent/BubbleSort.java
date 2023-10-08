package hwAssigmnent;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {5,6,9,8,1,0,2,20,3};
		for(int j=0; j<a.length; j++)
		{
			for(int i=0; i<a.length-1; i++)
			{
				System.out.println(a[i]+" "+a[i+1]);
				if(a[i]>a[i+1])
				{
					a[i]=a[i]+a[i+1];
					a[i+1]=a[i]-a[i+1];
					a[i]=a[i]-a[i+1];
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
