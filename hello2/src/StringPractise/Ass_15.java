package StringPractise;

public class Ass_15 
{
	public static void main(String[] args) 
	{
		String s = "Welcome to Java World";
		char[] ca = s.toCharArray();
 		for (int i = 0; i < s.length(); i++) 
		{
			if(ca[i] == 'd')
			{
				ca[i] = 'f';
			}
			
		}
 		s = new String(ca);
 		System.out.println(s);
		
	}

}
