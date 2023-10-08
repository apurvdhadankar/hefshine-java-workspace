
public class Q27_FindMissingAndRepeativeNo {

	public static void main(String[] args) {
		int[] a = {1, 3, 3};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					System.out.println("Repeatative element is - "+a[i]);
					break;
				}
			}
		}
//		Smallest Missing No
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		int b[] = new int[max];
		for (int i = 0; i < b.length; i++) 
		{
			b[i] = i+1;
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < b.length; i++) 
		{
			int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(b[i]==a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("Samllest Positive missing no is - "+b[i]);
				break;
			}
		}
//		System.out.println("Samllest Positive no is - "+min);
	}

}
