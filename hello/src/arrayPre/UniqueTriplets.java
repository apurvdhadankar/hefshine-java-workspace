package arrayPre;

public class UniqueTriplets {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,-5,-9,-6,3,1,7,-5};
		int n=2, count=0, sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		int b[] = new int[a.length-count];
		int indx=0;
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag = true;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					flag=false;
				}
			}
			if(flag)
			{
				b[indx]=a[i];
				indx++;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = i+1; j < b.length; j++) 
			{
				for (int k = j+1; k < b.length; k++) 
				{
					sum = a[i]+a[j]+a[k];
					if(sum==2)
					{
						System.out.print("["+a[i]+" "+a[j]+" "+a[k]+"]");
					}
				}
				
			}
		}
		
		
	}

}
