package StringPractise;

public class Ass_21 
{
	public static void main(String[] args) 
	{
		String s = "5616546";
		boolean flag = true;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) < '0' || s.charAt(i)>'9')
			{
				flag = false;
			}
			
		}
		if (flag) 
		{
			System.out.println("String contains only digits");	
		}
		else
		{
			System.out.println("String do not contains only digits");
		}

		
	}

}
