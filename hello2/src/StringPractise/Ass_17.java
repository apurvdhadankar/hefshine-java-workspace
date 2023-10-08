package StringPractise;

public class Ass_17 
{
	public static void main(String[] args) 
	{
		String s = "Welcome to Java World";
		char[] ca = new char[s.length()];
		for (int i = 0; i < ca.length; i++)
		{
			ca[i] = s.charAt(i);
			
		}
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.print(ca[i]);
			
		}
		
	}

}
