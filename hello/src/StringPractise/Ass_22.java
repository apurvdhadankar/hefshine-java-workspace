package StringPractise;

public class Ass_22 
{
	public static void main(String[] args) 
	{
		String s = "Welcome to Java World - lets learnl";
		System.out.println(s.length());
		for (int i = 0; i < s.length()-2; i+=5)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.println(i+j+" "+s.charAt(i+j));
			}
			
		}
		
	}

}
