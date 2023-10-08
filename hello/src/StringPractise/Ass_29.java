package StringPractise;

public class Ass_29 
{
	public static void main(String[] args) 
	{
		String s = "   Welcome  to  java World  ";
		char[] ca = s.toCharArray();
		int si = 0;
		int ei = 0;
		for (int i = 0; i < ca.length; i++) 
		{
			if (ca[i] != ' ') 
			{
				si = i;
				break;
			}
			
		}
		System.out.println(si);
		for (int i = ca.length-1; i > 0; i--) 
		{
			if (ca[i] != ' ') 
			{
				ei = i;
				break;
			}
			
		}
		System.out.println(ei);
		char[] nca = new char[(ei-si)+1];
		int ncai = 0;
		for (int i = si; i <= ei; i++)
		{
			nca[ncai] = ca[i];
			ncai++;
		}
		s = new String(nca);
		System.out.println(s);
	}

}
