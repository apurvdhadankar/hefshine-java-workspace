public class Q2SmaeElemets {
	 
	public static void main(String[] args) {
		
		int[] a = {1,3,4,5,7};
		int[] b = {2,3,5,6};
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			count=0;
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
