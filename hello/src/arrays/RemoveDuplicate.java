package arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a= {5,6,7,8,8,9,1,5,6,2};
		int count =0;
		boolean flag=false;
		for(int i=0 ; i<a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		int[] b = new int[a.length-count];
		int k=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				
				
				{
				if(a[i]==b[j])
				{
					flag = true;
				}
				}
		}
		if(flag)
		{
			b[k]=a[i];
			k++;
		}
		}
		for (k = 0; k < b.length; k++) 
		{
			System.out.print(b[k]+" ");
		}
		System.out.println(b[k]);

	}

}
