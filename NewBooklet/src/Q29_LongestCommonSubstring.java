
public class Q29_LongestCommonSubstring {

	public static String lcs(String X, String Y, int m, int n)	
	{
		int maxlen=0;
		int endIndex=m;
		int count=0;
		
		int lookup[][] = new int[m+1][n+1];
		for (int i = 1; i <= m; i++) 
		{
			for (int j = 1; j <= n; j++) 
			{
				if(X.charAt(i-1) == Y.charAt(j-1))
				{
					lookup[i][j] = lookup[i-1][j-1] + 1;
					
					if(lookup[i][j]>maxlen)
					{
						maxlen = lookup[i][j];
						count = maxlen;
						endIndex=i;
					}
				}
			}
		}
		System.out.println(count);
		return X.substring(endIndex - maxlen, endIndex);
	}
    public static void main(String[] args)
    {
        int n, m;
        String X = "ABCDGH";
        String Y = "ACDGHR";
 
        n = X.length();
        m = Y.length();
 
        System.out.println(lcs(X, Y, n, m));
    }
}
