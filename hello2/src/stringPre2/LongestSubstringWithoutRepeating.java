package stringPre2;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		String s = "ababc";
		char c[] = s.toCharArray();
		int max=0;
		int i=0, j=0;
		for ( i = 0; i < c.length; i++) 
		{
			for ( j = i+1; j < c.length; j++) 
			{
				int len = checkDuplicates(c,i,j);
				if(max<len)
					max=len;
			}
		}
		System.out.println("Max Len Is "+(max+1));
	}
	private static int checkDuplicates(char[] c, int i1, int j1) {
		boolean flag = false;
		int t1=0, t2=0;
		for (int i = i1; i <= i1; i++) 
		{
			for (int j = i+1; j <= j1; j++) 
			{
				if(c[i]==c[j] && flag==false)
				{
					t1=i;
					t2=j-1;
					flag=true;
					break;
				}
			}
		}
		if(flag==true)
		{
			return t2-t1;
		}
		else
		{
			return j1-i1;
		}
		
	}

}
