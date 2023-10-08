package StringPractise;

public class Ass_18 
{
	public static void main(String[] args) 
	{
		String s = "Welcome to Java World";
		char[] ca = s.toCharArray();
		for (int i = 0; i < ca.length; i++)
		{
			if(ca[i]>=97 && ca[i]<=122)
			{
				ca[i] =(char) (ca[i] -32);
			}
			
		}
		s = new String(ca);
		System.out.println(s);
		
	}

}
