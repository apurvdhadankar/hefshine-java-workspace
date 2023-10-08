package StringPractise;

public class Ass_10 
{
	public static void main(String[] args) 
	{
		String s = "Welcome to Java World";
		String p = "Welcome to Java World";
		boolean flag = true;
				
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) != p.charAt(i))
			{
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("Both Strings are equal");
		}
		else
		{
			System.out.println("Both Strings are not equal");
		}
		System.out.println(s.equals(p));
	}

}
