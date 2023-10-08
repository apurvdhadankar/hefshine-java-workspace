package hwAssigmnent;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {5,1,2,3,8,10,0,4};
		for(int i=0 ;i<a.length; i++)
		{
			int min=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[min]>a[j])
				{
					min = j;
				}
			}
//			int p=a[i];
//			int q= a[min];
//			a[i]=q;
//			a[min]=p;
			if(i!=min)
			{
			a[i]=a[i]+a[min];
			a[min]=a[i]-a[min];
			a[i]=a[i]-a[min];
			}
		
			
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
