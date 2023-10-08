package pre1;

public class Q7 {

	public static void main(String[] args) {
		int a[] = {2,2,3,4,5,5,5};
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
		int b[] = new int[a.length-count];
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
				b[index++] = a[i];
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}

	}

}
