package setA;

public class Q6_lexicograpgycally {

	public static void main(String[] args) {
		String s = "abcd";
		String s1 = "abcd";
		System.out.println(s.compareTo(s1));
		int len=0;
		if(s.length() < s1.length())
		{
			len = s.length();
		}
		else
		{
			len  = s1.length();
		}
		for (int i = 0; i < len; i++) 
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				int x = s.charAt(i) - s1.charAt(i);
				
			}
			else
			{
				System.out.println(s.length()-s1.length());
				break;
			}
		}

	}

}
