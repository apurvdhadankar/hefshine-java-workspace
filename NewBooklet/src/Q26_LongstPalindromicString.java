
public class Q26_LongstPalindromicString {
	static String temp = "";
	static StringBuffer sb;
	static String longSub="";
	static int max = Integer.MIN_VALUE;
	static void findLongestSubstring(String s)
	{
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			count=0;
			for (int j = i+1; j <= s.length(); j++) 
			{
				temp = s.substring(i, j);
				if(temp.length()>=2)
				{
					sb = new StringBuffer(temp);
					sb.reverse();
					if(sb.toString().compareTo(temp)==0)
					{
						count = sb.length();
						
					}
					if(count>max)
					{
						longSub = temp;
						max = count;
					}
				}
			}
		}
		System.out.println(longSub);
		System.out.println(max);
	}

	public static void main(String[] args) 
	{
		String s = "aaaabbaa";
		findLongestSubstring(s);
	}

}
