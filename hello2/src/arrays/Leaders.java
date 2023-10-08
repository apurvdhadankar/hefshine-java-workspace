package arrays;

public class Leaders {

	public static void main(String[] args)
	{
		int[] a = {1,5,6,9,7,8,5,6,4};
//		9,8,6,4
		for(int i=0 ;i<a.length; i++)
		{
			boolean flag = true;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]>a[i])
				{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.print(a[i]+" ");
		}

	}

}
