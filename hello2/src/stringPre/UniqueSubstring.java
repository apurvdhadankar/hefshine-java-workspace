package stringPre;

public class UniqueSubstring {
	public static void main(String[] args) {
		String s = "abcdeffrdfjksdhvkj";
		int si=0, ei=0;
		int max=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				boolean flag = false;
				for (int k = i; k < j; k++) 
				{
					if(s.charAt(j)==s.charAt(k) || j==s.length())
					{
						flag = true;
					}
				}
				if(flag)
				{
					if((j-i)>max)
					{
						max=j-i;
						si=i;
						ei=j-1;
					}
					break;
				}
			}
		}
		System.out.println(max);
		for (int i = si; i <= ei; i++) 
		{
			System.out.print(s.charAt(i));
		}
	}

}
