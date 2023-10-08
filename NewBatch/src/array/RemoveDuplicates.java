package array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = {11,22,55,99,99,88,4,5,61,1,1,1};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
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
				b[index]=a[i];
				index++;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}

}
