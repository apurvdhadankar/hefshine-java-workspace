package strings;

public class Lexicographically {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "abcd";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		System.out.println(s1.compareTo(s2));
		int len=0;
		if(s1.length()<s2.length())
		{
			len=s1.length();
		}
		else
		{
			len=s2.length();
		}
		int x=0;
		for (int i = 0; i < len; i++) 
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				 x = s1.charAt(i)-s2.charAt(i);
				 break;
			}
			else
			{
				x = s1.length()-s2.length();
			}
		}
		System.out.println(x);
		
		
		

	}

}
