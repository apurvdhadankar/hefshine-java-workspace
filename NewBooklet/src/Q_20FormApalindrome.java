
public class Q_20FormApalindrome {
	static int findMinInsertions(char s[], int l, int h)
			{
				if(l>h) return Integer.MAX_VALUE;
				if(l==h) return 0;
				if(l==h - 1) return(s[l]==s[h])? 0 : 1;
				  return (s[l] == s[h])?
			            findMinInsertions(s, l + 1, h - 1):
			            (Integer.min(findMinInsertions(s, l, h - 1),
			            findMinInsertions(s, l + 1, h)) + 1);
			}

	public static void main(String[] args) 
	{
		String s = "geeks";
		System.out.println(findMinInsertions(s.toCharArray(), 0, s.length()-1));

	}
}
