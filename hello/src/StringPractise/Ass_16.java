package StringPractise;

public class Ass_16 
{
	public static void main(String[] args) 
	{
		String s = "Welcome to Java World";
		String p = "wel";
		System.out.println(s.startsWith(p));
		boolean flag = true;
		for (int i = 0; i < p.length(); i++)
		{
			if(s.charAt(i) != p.charAt(i))
			{
				flag = false;
			}
			
		}
		if (flag) 
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}

		
	}

}
