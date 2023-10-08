
public class Q12LongestIncreasingSubSequnce {

	public static void main(String[] args) {
		int a[]={5,8,3,7,9,1};
		int lis[] = new int[a.length];
		int i,j, max=0;
		for ( i = 0; i < lis.length; i++) 
		{
			lis[i]=1;
		}
		for (i = 0; i < lis.length; i++) 
		{
			for ( j = 0; j < i; j++) 
			{
				if(a[i]>a[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
			}
		}
		for (i = 0; i < a.length; i++) 
		{
			if(max < lis[i])
			{
				max = lis[i];
			}
		}
		System.out.println(max);
		
		
		

	}

}
