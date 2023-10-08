package array;

public class NumberOfUniquePairs {

	public static void main(String[] args) {
		int[] a = {1,1,2};
		int count=0;
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
//		System.out.println(count);
		int[] b = new int[a.length-count];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			count=0;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				b[index] = a[i];
				index++;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.println(b[i]+" "+b[j]);
			}
		}

	}

}
