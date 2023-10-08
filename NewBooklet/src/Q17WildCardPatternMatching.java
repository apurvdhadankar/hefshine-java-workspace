
public class Q17WildCardPatternMatching {

	public static void main(String[] args) {
		String s = "ba*a?";
		String s2 = "baaabab";
		int t1=0;
		int t2=0;
		String str = "aab";
		String str1="b";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='*')
			{
				t1 = i;
			}
			if(s.charAt(i)=='?')
			{
				t2=i;
			}
		}
		String p = "";
		for (int i = 0; i < s.length(); i++) 
		{
			if(i!=t1 && i!=t2)
			{
				p = p+s.charAt(i);
			}
			if(i==t1)
			{
				p=p+str;
			}
			if(i==t2)
			{
				p=p+str1;
			}
		}
		System.out.println(p);
		System.out.println(s2);
		if(s2.compareTo(p)==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}

	}

}
