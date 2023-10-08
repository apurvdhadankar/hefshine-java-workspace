package recursionPre;

public class SubarrayQ {

	public static void main(String[] args) {
		int[] a = {1,12,23,34};
		int k=3;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					count++;
				}
				else
				{
				System.out.println(a[i]+" "+a[j]);
				count++;
				}
			}
		}
		System.out.println("Count "+count);
		
	}

}
