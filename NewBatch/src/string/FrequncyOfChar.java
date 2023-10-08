package string;

public class FrequncyOfChar {

	public static void main(String[] args) {
		String s = "aaaabbbccaab";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					break;
				}
			}
		}
		char[] c = new char[s.length()-cnt];
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			cnt=0;
			for (int j = 0; j < c.length; j++) 
			{
				if(s.charAt(i)==c[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				c[index++]=s.charAt(i);
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			cnt=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(c[i]==s.charAt(j))
				{
					cnt++;
				}
			}
			System.out.println(c[i]+" "+cnt);
		}
	}

}
